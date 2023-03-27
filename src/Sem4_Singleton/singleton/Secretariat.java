package Sem4_Singleton.singleton;

public class Secretariat {
    private int numarBirou;
    private int numarAngajati;
    private static Secretariat instanta = null;

    private Secretariat(int numarBirou, int numarAngajati) {
        this.numarBirou = numarBirou;
        this.numarAngajati = numarAngajati;
    }

    public static synchronized Secretariat getInstance(int numarBirou, int numarAngajati) {
        if (instanta == null) {
            instanta = new Secretariat(numarBirou, numarAngajati);
        }

        return instanta;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("singleton.classes.Secretariat{");
        sb.append("numarBirou=").append(this.numarBirou);
        sb.append(", numarAngajati=").append(this.numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}
