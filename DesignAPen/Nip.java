package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.NipType;
import Projects.DesignAPen.EnumsOfPen.Radius;

public class Nip {
    private Radius radius;
    private NipType nipType;

    public Radius getRadius() {
        return radius;
    }

    public void setRadius(Radius radius) {
        this.radius = radius;
    }

    public NipType getNipType() {
        return nipType;
    }

    public void setNipType(NipType nipType) {
        this.nipType = nipType;
    }
}
