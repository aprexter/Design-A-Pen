package Projects.DesignAPen.TypesOfPen;

import Projects.DesignAPen.*;
import Projects.DesignAPen.EnumsOfPen.*;
import Projects.DesignAPen.RefilTypes.MarkerRefil;


public class MarkerPen extends Pen implements RefilPen<MarkerRefil> {

    private MarkerRefil refil;
    private boolean canChangeRefil;
    private MarkerPen(WritingBehaviour writingBehaviour) {
        super(PenType.MARKER,writingBehaviour);
    }

    public static class Builder extends PenBuilder<MarkerRefil,MarkerPen> {
        @Override
        public MarkerPen build() {
            MarkerPen markerPen=new MarkerPen(WritingBehaviour.HIGHLIGHTER);
            markerPen.refil=refil;
            markerPen.setName(name);
            markerPen.setCompany(company);
            markerPen.setPrice(price);

            markerPen.canChangeRefil=canChangeRefil;
            return markerPen;
        }
    }



    @Override
    public MarkerRefil getRefil() {
        return this.refil;
    }

    @Override
    public boolean canChangeRefil() {
        return this.canChangeRefil;
    }

    @Override
    public void changeRefil(MarkerRefil newRefil) {
        this.refil=newRefil;
    }

    @Override
    public Color getColor() {
        return this.refil.getColor();
    }
}
