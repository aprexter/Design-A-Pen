package Projects.DesignAPen.TypesOfPen;

import Projects.DesignAPen.*;
import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.PenType;
import Projects.DesignAPen.Strategies.SmoothWritingBehaviour;
import Projects.DesignAPen.Strategies.WriteBeahviourStrategies;

public class MarkerPen extends Pen implements RefilPen {

    private Refil refil;
    private boolean canChangeRefil;
    private MarkerPen(WriteBeahviourStrategies writeBeahviourStrategies) {
        super(PenType.MARKER, writeBeahviourStrategies);
    }

    public static class Builder extends PenBuilder<MarkerPen> {
        @Override
        public MarkerPen build() {
            MarkerPen markerPen=new MarkerPen(new SmoothWritingBehaviour());
            markerPen.refil=refil;
            markerPen.canChangeRefil=canChangeRefil;
            return markerPen;
        }
    }
    @Override
    public Refil getRefil() {
        return null;
    }

    @Override
    public boolean canChangeRefil() {
        return false;
    }

    @Override
    public void changeRefil(Refil newRefil) {

    }



    @Override
    public Color getColor() {
        return null;
    }
}
