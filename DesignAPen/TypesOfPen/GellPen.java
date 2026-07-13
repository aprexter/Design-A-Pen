package Projects.DesignAPen.TypesOfPen;

import Projects.DesignAPen.*;
import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.PenType;
import Projects.DesignAPen.RefilTypes.GellPenRefil;
import Projects.DesignAPen.Strategies.FlowlyWritingBehaviour;
import Projects.DesignAPen.Strategies.WriteBeahviourStrategies;

import java.lang.reflect.GenericArrayType;
import java.sql.Ref;

public class GellPen extends Pen implements RefilPen<GellPenRefil> {
    private Refil  refil;
    private boolean canChangeRefil;

    private GellPen(WriteBeahviourStrategies writeBeahviourStrategies) {
        super(PenType.GELL,writeBeahviourStrategies);
    }
    public static class Builder extends PenBuilder<GellPen,GellPenRefil> {
        @Override
        public GellPen build(){
            GellPen gellPen=new GellPen(new FlowlyWritingBehaviour());
            gellPen.refil=refil;
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
    public void changeRefil(Refil newRefil) {

    }


    @Override
    public Color getColor() {
        return null;
    }
}
