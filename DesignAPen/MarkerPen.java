package Projects.DesignAPen;

public class MarkerPen extends Pen implements RefilPen {
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
    public MarkerPen() {
        super(PenType.MARKER);
    }
    @Override
    public void write() {

    }

    @Override
    public COLOR getColor() {
        return null;
    }
}
