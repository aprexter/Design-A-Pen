package Projects.DesignAPen.TypesOfPen;

import Projects.DesignAPen.*;
import Projects.DesignAPen.EnumsOfPen.*;
import Projects.DesignAPen.RefilTypes.BallPenRefil;


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
            ballPen.canChangeRefil=canChangeRefil;
            ballPen.setName(name);
            ballPen.setCompany(company);
            ballPen.setPrice(price);
            return ballPen;
        }
    }


    @Override
    public Color getColor() {
        return this.refil.getColor();
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
