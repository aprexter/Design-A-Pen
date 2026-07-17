package Projects.DesignAPen.RefilTypes;

import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.Ink;
import Projects.DesignAPen.Nip;
import Projects.DesignAPen.Refil;

public class MarkerRefil extends Refil {

    public MarkerRefil(Ink ink,Nip nip) {
        super(ink,nip);
    }

    @Override
    public Color getColor() {
        return this.getInk().getColor();
    }

    @Override
    public void getLeftOverInk() {

    }
}
