package Sem4_Singleton.singleton;

public class BazeDate {
    private int dimensiuneDate;
    private int numarTabele;
    private String denumire;
    public static BazeDate instanta = new BazeDate(100, 2, "A");

    private BazeDate() {
    }

    private BazeDate(int dimensiuneDate, int numarTabele, String denumire) {
        this.dimensiuneDate = dimensiuneDate;
        this.numarTabele = numarTabele;
        this.denumire = denumire;
    }

    public static BazeDate getInstance() {
        return instanta;
    }

    public void setDimensiuneDate(int dimensiuneDate) {
        this.dimensiuneDate = dimensiuneDate;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BazeDate{");
        sb.append("dimensiuneDate=").append(this.dimensiuneDate);
        sb.append(", numarTabele=").append(this.numarTabele);
        sb.append(", denumire='").append(this.denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
