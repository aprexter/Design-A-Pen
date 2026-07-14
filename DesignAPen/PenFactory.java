package Projects.DesignAPen;

import Projects.DesignAPen.Strategies.PressurSensitiveWritingBehaviour;
import Projects.DesignAPen.TypesOfPen.BallPen;
import Projects.DesignAPen.TypesOfPen.FountainPen;
import Projects.DesignAPen.TypesOfPen.GellPen;
import Projects.DesignAPen.TypesOfPen.MarkerPen;


public class PenFactory {


    public static GellPen.Builder createGellPen() {
        return new GellPen.Builder();
    }

    public static BallPen.Builder createBallPen() {
        return new BallPen.Builder();
    }

    public static MarkerPen.Builder createMarkerPen() {
        return new MarkerPen.Builder();
    }
    public static FountainPen.Builder createFountainPen() {
        return new FountainPen.Builder();
    }
}
