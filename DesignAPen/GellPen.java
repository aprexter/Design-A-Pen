package Projects.DesignAPen;

public class GellPen extends Pen implements RefilPen {
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

    public GellPen() {
            super(PenType.GELL);
    }
    @Override
    public void write() {

    }

    @Override
    public COLOR getColor() {
        return null;
    }
}
