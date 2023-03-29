package Sem6.builder_exD3;

public class ContBancar {
    private boolean salariu;
    private boolean cardAtasat;
    private String numeClient;
    private boolean internet;

    public ContBancar(boolean salariu, boolean cardAtasat, String numeClient, boolean internet) {
        this.salariu = salariu;
        this.cardAtasat = cardAtasat;
        this.numeClient = numeClient;
        this.internet = internet;
    }



    protected void setSalariu(boolean salariu) {
        this.salariu = salariu;
    }


    protected void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    protected void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }



    protected void setInternet(boolean internet) {
        this.internet = internet;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("salariu=").append(salariu);
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", internet=").append(internet);
        sb.append('}');
        return sb.toString();
    }
}
