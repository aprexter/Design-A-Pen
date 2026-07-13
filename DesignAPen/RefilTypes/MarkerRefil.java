package Projects.DesignAPen.RefilTypes;

import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.PenType;
import Projects.DesignAPen.Refil;

public class MarkerRefil extends Refil {

    public MarkerRefil() {
        setPenType(PenType.MARKER);
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public void getLeftOverInk() {

    }
}
