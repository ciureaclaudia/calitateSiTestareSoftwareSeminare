package Sem10.flyweight_exD10;

public class Detinator implements IClientBanca{
    private String nume;
    private String nrTel;
    private String adresa;

    public Detinator(String nume, String nrTel, String adresa) {
        this.nume = nume;
        this.nrTel = nrTel;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Detinator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTel=").append(nrTel);
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere(Cont cont) {
        System.out.println(nume+" "+ nrTel);
    }
}
