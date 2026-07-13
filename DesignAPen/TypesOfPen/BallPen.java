package Projects.DesignAPen.TypesOfPen;

import Projects.DesignAPen.*;
import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.PenType;

public class BallPen extends Pen implements RefilPen {

    private Refil refil;
    private boolean canChangeRefil;
    private BallPen() {
        super(PenType.BALL);
    }

    public static class Builder extends PenBuilder<BallPen> {
        @Override
        public BallPen build() {
            BallPen ballPen=new BallPen();
            ballPen.refil=refil;
            this.canChangeRefil=canChangeRefil;
            return ballPen;
        }
    }



    @Override
    public void write() {

    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public Refil getRefil() {
        return this.refil;
    }

    @Override
    public boolean canChangeRefil() {
        return false;
    }

    @Override
    public void changeRefil(Refil newRefil) {

    }
}
