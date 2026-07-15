package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.NipType;
import Projects.DesignAPen.EnumsOfPen.Radius;

public class Nip {
    private final Radius radius;
    private final NipType nipType;
    public Nip(NipType nipType, Radius radius) {
        this.radius=radius;
        this.nipType=nipType;

    }

    public Radius getRadius() {
        return radius;
    }
    public NipType getNipType() {
        return nipType;
    }

}
