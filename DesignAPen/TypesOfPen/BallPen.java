package Projects.DesignAPen.TypesOfPen;

import Projects.DesignAPen.*;
import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.PenType;
import Projects.DesignAPen.Strategies.PressurSensitiveWritingBehaviour;
import Projects.DesignAPen.Strategies.WriteBeahviourStrategies;

public class BallPen extends Pen implements RefilPen {

    private Refil refil;
    private boolean canChangeRefil;
    private BallPen(WriteBeahviourStrategies writeBeahviourStrategies) {
        super(PenType.BALL,writeBeahviourStrategies);
    }

    public static class Builder extends PenBuilder {
        @Override
        public BallPen build() {
            BallPen ballPen=new BallPen(new PressurSensitiveWritingBehaviour());
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
        return this.refil.getColor();
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
