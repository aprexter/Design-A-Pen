package Projects.DesignAPen.TypesOfPen;

import Projects.DesignAPen.EnumsOfPen.*;
import Projects.DesignAPen.Ink;
import Projects.DesignAPen.Nip;
import Projects.DesignAPen.Pen;

public class FountainPen extends Pen {
    private Ink ink;
    private Nip nip;
    private Color color;


    private FountainPen(WritingBehaviour writingBehaviour) {
        super(PenType.FOUNTAIN,writingBehaviour);
    }
    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder {
        private WritingBehaviour writingBehaviour=WritingBehaviour.SMOOTH;
        private boolean canChangeInk=false;
        private Ink ink;
        private Nip nip;
        private String penName;
        private double price;
        private Company company;

        public Builder penName(String penName) {
            this.penName=penName;
            return this;
        }
        public Builder setPrice(double price) {
            this.price=price;
            return this;
        }
        public Builder setCompany(Company company) {
            this.company=company;
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
        public Builder setNip(Nip nip){
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
            fountainPen.setCompany(company);
            fountainPen.setName(penName);
            fountainPen.setPrice(price);
            return fountainPen;
        }
    }


    @Override
    public Color getColor() {
        return this.ink.getColor();
    }
}
