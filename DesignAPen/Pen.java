package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.Company;
import Projects.DesignAPen.EnumsOfPen.PenType;
import Projects.DesignAPen.EnumsOfPen.WritingBehaviour;
import Projects.DesignAPen.Strategies.WriteBeahviourStrategies;

public abstract class Pen {

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public PenType getPenType() {
        return penType;
    }

    public void setPenType(PenType penType) {
        this.penType = penType;
    }
    private String name;
    private double price;
    private Company company;
    private PenType penType;
    public static WritingBehaviourRegistry writingBehaviourRegistry;
    private WritingBehaviour writingBehaviour;




    public Pen(PenType penType, WritingBehaviour writingBehaviour) {
        this.writingBehaviour=writingBehaviour;
        this.penType = penType;
    }

    public void write(){
        this.writingBehaviourRegistry.getStrategies(writingBehaviour).write();
    }
    public abstract Color getColor();
}
