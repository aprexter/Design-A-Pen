package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.Color;
import Projects.DesignAPen.EnumsOfPen.WritingBehaviour;

import java.sql.Ref;

public abstract class PenBuilder<T extends Refil,R extends RefilPen<T>> {

    protected Color color=Color.BLUE;
    protected T refil=null;
    protected boolean canChangeRefil=false;
    protected WritingBehaviour writingBehaviour=WritingBehaviour.SMOOTH;
    public PenBuilder<T,R> setColor(Color color) {
        this.color = color;
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
