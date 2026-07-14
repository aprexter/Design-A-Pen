package Projects.DesignAPen.TypesOfPen;

import Projects.DesignAPen.*;
import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.PenType;
import Projects.DesignAPen.EnumsOfPen.WritingBehaviour;
import Projects.DesignAPen.RefilTypes.BallPenRefil;
import Projects.DesignAPen.RefilTypes.GellPenRefil;
import Projects.DesignAPen.Strategies.PressurSensitiveWritingBehaviour;
import Projects.DesignAPen.Strategies.WriteBeahviourStrategies;

public class BallPen extends Pen implements RefilPen<BallPenRefil> {

    private BallPenRefil refil;
    private boolean canChangeRefil;

    private BallPen(WritingBehaviour writingBehaviour) {
        super(PenType.BALL,writingBehaviour);
    }

    public static class Builder extends PenBuilder<BallPenRefil,BallPen> {
        @Override
        public BallPen build() {
            BallPen ballPen=new BallPen(writingBehaviour);
            ballPen.refil=refil;
            ballPen.refil.getInk().setColor(color);
            ballPen.canChangeRefil=canChangeRefil;
            return ballPen;
        }
    }


    @Override
    public Color getColor() {
        return this.refil.getInk().getColor();
    }

    @Override
    public BallPenRefil getRefil() {
        return this.refil;
    }

    @Override
    public boolean canChangeRefil() {
        return this.canChangeRefil;
    }

    @Override
    public void changeRefil(BallPenRefil newRefil) {
        this.refil=newRefil;
    }
}
