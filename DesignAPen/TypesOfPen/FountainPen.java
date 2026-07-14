package Projects.DesignAPen.TypesOfPen;

import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.NipType;
import Projects.DesignAPen.EnumsOfPen.WritingBehaviour;
import Projects.DesignAPen.Ink;
import Projects.DesignAPen.Nip;
import Projects.DesignAPen.Pen;
import Projects.DesignAPen.EnumsOfPen.PenType;
import Projects.DesignAPen.Strategies.WriteBeahviourStrategies;

public class FountainPen extends Pen {
    private Ink ink;
    private Nip nip;
    private Color color;


    public FountainPen(WritingBehaviour writingBehaviour) {
        super(PenType.FOUNTAIN,writingBehaviour);
    }
    public static class Builder {
        private WritingBehaviour writingBehaviour=WritingBehaviour.SMOOTH;
        private Color color=Color.BLUE;
        private boolean canChangeInk=false;
        private Ink ink;
        private Nip nip;




        public Builder setColor(Color color) {
            this.color = color;
            return this;
        }
        public Builder canChangeInk(Boolean canChangeInk) {
            this.canChangeInk=canChangeInk;
            return this;
        }
        public Builder setInk(Ink ink) {
            this.ink = ink;
            return this;
        }
        public Builder setNipType(Nip nip){
            this.nip=nip;
            return this;
        }
        public Builder setWritingBehaviour(WritingBehaviour writingBehaviour) {
            this.writingBehaviour=writingBehaviour;
            return this;
        }

        public FountainPen build() {
            FountainPen fountainPen=new FountainPen(writingBehaviour);
            fountainPen.nip=nip;
            fountainPen.ink=ink;
            fountainPen.ink.setColor(color);
            return fountainPen;
        }
    }


    @Override
    public Color getColor() {
        return this.ink.getColor();
    }
}
