package Projects.DesignAPen.TypesOfPen;

import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.Pen;
import Projects.DesignAPen.EnumsOfPen.PenType;

public class FountainPen extends Pen {



    public FountainPen() {
        super(PenType.FOUNTAIN);
    }
    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }
}
