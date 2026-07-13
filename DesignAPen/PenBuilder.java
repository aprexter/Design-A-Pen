package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.Color;

public abstract class PenBuilder<T extends Pen> {

    protected Color color;
    protected Refil refil;
    protected boolean canChangeRefil;

    public PenBuilder<T> color(Color color) {
        this.color = color;
        return this;
    }

    public PenBuilder<T> refil(Refil refil) {
        this.refil = refil;
        return this;
    }

    public PenBuilder<T> canChangeRefil(boolean value) {
        this.canChangeRefil = value;
        return this;
    }

    public abstract T build();
}
