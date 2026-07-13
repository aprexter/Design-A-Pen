package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.Company;
import Projects.DesignAPen.EnumsOfPen.PenType;

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

    private double price;
    private Company company;
    private PenType penType;

    public Pen(PenType penType) {
        this.penType = penType;
    }

    public abstract void write();
    public abstract Color getColor();
}
