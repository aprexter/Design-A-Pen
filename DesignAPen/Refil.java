package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.Color;

public abstract class Refil {
    private final Ink ink;
    private final Nip nip;
    public abstract Color getColor();
    public abstract  void getLeftOverInk();

    public Refil(Ink ink,Nip nip){
        this.ink=ink;
        this.nip=nip;
    }
    public Ink getInk() {
        return ink;
    }
    public Nip getNip() {
        return nip;
    }
}
