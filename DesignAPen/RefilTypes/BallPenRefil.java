package Projects.DesignAPen.RefilTypes;

import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.PenType;
import Projects.DesignAPen.Refil;

public class BallPenRefil extends Refil {



     public BallPenRefil() {
         setPenType(PenType.BALL);
     }

    @Override
    public Color getColor() {
        return this.getInk().getColor();
    }

    @Override
    public void getLeftOverInk() {

    }
}
