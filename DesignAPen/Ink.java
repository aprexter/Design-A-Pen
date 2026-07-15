package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.NipType;
import Projects.DesignAPen.EnumsOfPen.PenType;

public  class Ink{


    private  Color color;
    private  double density;
    public void setColor(Color color) {
        this.color=color;
    }
    public Color getColor() {
        return color;
    }

    public double getDensity() {
        return density;
    }

}
