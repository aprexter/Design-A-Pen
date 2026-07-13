package Projects.DesignAPen.RefilTypes;

import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.PenType;
import Projects.DesignAPen.Refil;

public class GellPenRefil extends Refil {

    public GellPenRefil() {
        setPenType(PenType.GELL);
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public void getLeftOverInk() {

    }
}
