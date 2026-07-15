package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.WritingBehaviour;
import Projects.DesignAPen.RefilTypes.GellPenRefil;
import Projects.DesignAPen.Strategies.*;
import Projects.DesignAPen.TypesOfPen.GellPen;

public class Customer {
    public static void main(String[] args) {
        WritingBehaviourRegistry wbr=WritingBehaviourRegistry.getInstance();
        wbr.registerWritingBehaviour(WritingBehaviour.SMOOTH,new SmoothWritingBehaviour());
        wbr.registerWritingBehaviour(WritingBehaviour.FLOWLY,new FlowlyWritingBehaviour());
        wbr.registerWritingBehaviour(WritingBehaviour.TEXTURED,new TextureWritingBehaviour());
        wbr.registerWritingBehaviour(WritingBehaviour.HIGHLIGHTER,new HighlighterWritingBehaviour());
        wbr.registerWritingBehaviour(WritingBehaviour.NORMAL,new NormalWritingBehaviour());
        wbr.registerWritingBehaviour(WritingBehaviour.VELOCITY_SENSITIVE,new VelocitySensitiveWritingBehavior());
        wbr.registerWritingBehaviour(WritingBehaviour.PRESSURE_SENSITIVE,new PressurSensitiveWritingBehaviour());



        GellPen gellPen=PenFactory.createGellPen().setWritingBehaviour(WritingBehaviour.HIGHLIGHTER)
                .setRefil(new GellPenRefil())
                .setColor(Color.GREEN).build();
        System.out.println(gellPen.getColor());
        gellPen.write();
    }
}
