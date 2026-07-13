package Projects.DesignAPen.TypesOfPen;

import Projects.DesignAPen.*;
import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.PenType;

public class MarkerPen extends Pen implements RefilPen {

    private Refil refil;
    private boolean canChangeRefil;
    private MarkerPen() {
        super(PenType.MARKER);
    }

    public static class Builder extends PenBuilder<MarkerPen> {
        @Override
        public MarkerPen build() {
            MarkerPen markerPen=new MarkerPen();
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
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }
}
