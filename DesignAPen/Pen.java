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
    private WriteBeahviourStrategies writeBeahviourStrategies;

    public Pen(PenType penType, WriteBeahviourStrategies writeBeahviourStrategies) {
        this.writeBeahviourStrategies=writeBeahviourStrategies;
        this.penType = penType;
    }

    public void write(){
        this.writeBeahviourStrategies.write();
    }
    public abstract Color getColor();
}
