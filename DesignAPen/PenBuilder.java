package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.Company;
import Projects.DesignAPen.EnumsOfPen.WritingBehaviour;



public abstract class PenBuilder<T extends Refil,R extends RefilPen<T>> {

    protected String name;
    protected double price;
    protected Company company;
    protected T refil=null;
    protected boolean canChangeRefil=false;
    protected WritingBehaviour writingBehaviour=WritingBehaviour.SMOOTH;


    public PenBuilder<T,R> setName(String name){
        this.name = name;
        return this;
    }
    public PenBuilder<T,R> setPrice(double price){
        this.price = price;
        return this;
    }
    public PenBuilder<T,R> setCompany(Company company){
        this.company = company;
        return this;
    }

    public PenBuilder<T,R> setRefil(T refil) {
        this.refil = refil;
        return this;
    }
    public PenBuilder<T,R> setWritingBehaviour(WritingBehaviour writingBehaviour) {
        this.writingBehaviour = writingBehaviour;
        return this;
    }
    public PenBuilder<T,R> canChangeRefil(boolean value) {
        this.canChangeRefil = value;
        return this;
    }

    public abstract R build();
}
