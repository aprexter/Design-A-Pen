package Projects.DesignAPen.TypesOfPen;

import Projects.DesignAPen.*;
import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.PenType;

public class GellPen extends Pen implements RefilPen {
    private Refil refil;
    private boolean canChangeRefil;

    private GellPen() {
        super(PenType.GELL);
    }
    public static class Builder extends PenBuilder<GellPen> {
        @Override
        public GellPen build(){
            GellPen gellPen=new GellPen();
            gellPen.refil=refil;
            gellPen.canChangeRefil=canChangeRefil;
            return gellPen;
        }
    }





    @Override
    public Refil getRefil() {
        return this.refil;
    }

    @Override
    public boolean canChangeRefil() {
        return this.canChangeRefil;
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
