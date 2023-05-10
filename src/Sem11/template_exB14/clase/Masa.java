package Sem11.template_exB14.clase;

public class Masa extends AbstractMasa{
    public Masa(int nr){
        super(nr);
    }

    @Override
    protected void curataMasa() {
        System.out.println("Masa a fost curatata la numarul "+ super.getNr());
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Masa are servetelele asezate acum "+ super.getNr());
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Masa a fost ocupata de invitati "+ super.getNr());
    }

}
