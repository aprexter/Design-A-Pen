package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.Color;


public  class Ink{


    private final Color color;
    public Ink(Color color) {
        this.color = color;
    }
    private  double density;
    public Color getColor() {
        return color;
    }

    public double getDensity() {
        return density;
    }

}
