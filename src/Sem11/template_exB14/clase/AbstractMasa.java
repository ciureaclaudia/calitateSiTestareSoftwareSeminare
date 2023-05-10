package Sem11.template_exB14.clase;

public abstract class AbstractMasa {
    private int nr;

    public AbstractMasa(int nr) {
        this.nr = nr;
    }

    protected abstract void curataMasa();
    protected abstract void aseazaServetele();
    protected abstract void invitaPersoane();
    public final void ocupaMesa(){
        curataMasa();
        aseazaServetele();
        invitaPersoane();
    }

    public int getNr() {
        return nr;
    }
}
