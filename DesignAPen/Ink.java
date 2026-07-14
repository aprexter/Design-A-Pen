package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.NipType;
import Projects.DesignAPen.EnumsOfPen.PenType;

public abstract class Ink{


    private Color color=Color.GREEN;
    private PenType penType=PenType.BALL;
    private double density=3.0;
    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public PenType getPenType() {
        return penType;
    }

    public void setPenType(PenType penType) {
        this.penType = penType;
    }

    public double getDensity() {
        return density;
    }


    public void setDensity(double density) {
        this.density = density;
    }
}
