package Sem6.builder_exD3;

public class ContBancarBuilder implements InterfataBuilder {
    //aici apelam constuctorul
    private boolean salariu;
    private boolean cardAtasat;
    private String numeClient;
    private boolean internet;

    public InterfataBuilder setSalariu(boolean salariu) {
        this.salariu = salariu;
        return this;
    }

    public InterfataBuilder setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    public InterfataBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public InterfataBuilder setInternet(boolean internet) {
        this.internet = internet;
        return this;
    }

    public ContBancar build(){
        ContBancar cont=new ContBancar(this.salariu, this.internet, this.numeClient, this.cardAtasat);
        return cont;
    }

    //constructor de la Builder fara parametrii care initializeaza atributele cu val default

    public ContBancarBuilder() {
      this.salariu=false;
      this.internet=false;
      this.cardAtasat=false;
      this.numeClient="Anonim";
    }
}
