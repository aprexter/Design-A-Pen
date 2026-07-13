package Projects.DesignAPen;

import Projects.DesignAPen.EnumsOfPen.Color;

import java.sql.Ref;

public abstract class PenBuilder {

    protected Color color;
    protected Refil refil;
    protected boolean canChangeRefil;

    public PenBuilder color(Color color) {
        this.color = color;
        return this;
    }

    public PenBuilder refil(Refil refil) {
        this.refil = refil;
        return this;
    }

    public PenBuilder canChangeRefil(boolean value) {
        this.canChangeRefil = value;
        return this;
    }

    public abstract Pen build();
}
