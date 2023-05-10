package Sem11.template_exB14.clase;

import Sem11.template_exB14.clase.AbstractMasa;

public class MasaRezervata extends AbstractMasa {
    private String oraRezarvare;

    public MasaRezervata(int nr, String oraRezervare) {
        super(nr);
        this.oraRezarvare = oraRezervare;
    }

    @Override
    protected void curataMasa() {
        System.out.println("Masa " + super.getNr() + " a fost curatata inainte de ora " + this.oraRezarvare);
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Masa " + super.getNr() + " au fost asezate servetelele inainte de ora " + this.oraRezarvare);
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Masa " + super.getNr() + " au fost invitate persoanele de ora " + this.oraRezarvare);
    }

}
