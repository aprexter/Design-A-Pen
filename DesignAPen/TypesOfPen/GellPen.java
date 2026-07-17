package Projects.DesignAPen.TypesOfPen;

import Projects.DesignAPen.*;
import Projects.DesignAPen.EnumsOfPen.*;
import Projects.DesignAPen.RefilTypes.GellPenRefil;


public class GellPen extends Pen implements RefilPen<GellPenRefil> {
    private GellPenRefil  refil;
    private boolean canChangeRefil;

    private GellPen(WritingBehaviour writingBehaviour) {
        super(PenType.GELL,writingBehaviour);
    }
    public static class Builder extends PenBuilder<GellPenRefil,GellPen> {
        @Override
        public GellPen build(){
            GellPen gellPen=new GellPen(writingBehaviour);
            gellPen.refil=refil;
            gellPen.setName(name);
            gellPen.setCompany(company);
            gellPen.setPrice(price);



            gellPen.canChangeRefil=canChangeRefil;
            return gellPen;
        }
    }


    @Override
    public GellPenRefil getRefil() {
        return  this.refil;
    }

    @Override
    public boolean canChangeRefil() {
        return this.canChangeRefil;
    }



    @Override
    public void changeRefil(GellPenRefil newRefil) {
        this.refil=newRefil;
    }

    @Override
    public Color getColor() {
        return this.refil.getColor();
    }
}
