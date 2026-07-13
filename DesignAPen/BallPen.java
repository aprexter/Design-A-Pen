package Projects.DesignAPen;

public class BallPen extends Pen implements RefilPen {



    public BallPen() {
        super(PenType.BALL);
    }

    @Override
    public void write() {

    }

    @Override
    public COLOR getColor() {
        return null;
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
}
