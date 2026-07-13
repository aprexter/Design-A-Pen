package Projects.DesignAPen.TypesOfPen;

import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.WritingBehaviour;
import Projects.DesignAPen.Pen;
import Projects.DesignAPen.EnumsOfPen.PenType;
import Projects.DesignAPen.Strategies.WriteBeahviourStrategies;

public class FountainPen extends Pen {



    public FountainPen(WriteBeahviourStrategies writeBeahviourStrategies) {
        super(PenType.FOUNTAIN,writeBeahviourStrategies);
    }


    @Override
    public Color getColor() {
        return null;
    }
}
