package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.*;
import Projects.DesignAPen.Strategies.*;
import Projects.DesignAPen.TypesOfPen.FountainPen;

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

        Ink ink=new Ink(Color.BLUE);
        Nip nip=new Nip(NipType.FountainPenNip, Radius.R55MM);

        //Making Pen using Builder Class
        FountainPen fountainPen=FountainPen.getBuilder()
                .penName("FountainPen")
                .setCompany(Company.PARKER)
                .setWritingBehaviour(WritingBehaviour.SMOOTH)
                .setPrice(3000.0)
                .setNip(nip)
                .setInk(ink)
                .build();
        //Receiving pen from pen registry
        PenRegistry penRegistry=new PenRegistry();
        penRegistry.PenRegistry(fountainPen.getName(), fountainPen);
        Pen fw=penRegistry.getPen("FountainPen");
        System.out.println(fw.getName());



    }
}
