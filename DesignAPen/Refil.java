package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.PenType;

public abstract class Refil {
    private Ink ink;
    private PenType penType;
    private Nip nip;
    public abstract Color getColor();
    public abstract  void getLeftOverInk();

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Nip getNip() {
        return nip;
    }

    public void setNip(Nip nip) {
        this.nip = nip;
    }

    public PenType getPenType() {
        return penType;
    }

    public void setPenType(PenType penType) {
        this.penType = penType;
    }
}
