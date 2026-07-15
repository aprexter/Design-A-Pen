package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.PenType;

public abstract class Refil {
    private  Ink ink;
    private  Nip nip;
    public abstract Color getColor();
    public abstract  void getLeftOverInk();

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public void setNip(Nip nip) {
        this.nip = nip;
    }

    public Ink getInk() {
        return ink;
    }
    public Nip getNip() {
        return nip;
    }
}
