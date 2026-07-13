package Projects.DesignAPen;

public abstract class Pen {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

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
    private String brand;
    private PenType penType;

    public Pen(PenType penType) {
        this.penType = penType;
    }

    public abstract void write();
    public abstract COLOR getColor();
}
