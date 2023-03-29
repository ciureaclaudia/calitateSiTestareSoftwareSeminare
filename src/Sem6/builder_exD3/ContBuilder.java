package Sem6.builder_exD3;

public class ContBuilder implements InterfataBuilder {
    ContBancar contBancar;

    public ContBuilder( ) {
        this.contBancar = new ContBancar(false,false,"Anonim",false);
    }

    @Override
    public ContBancar build() {
        return this.contBancar;
    }

    public ContBuilder setSalariu(boolean salariu) {
        this.contBancar.setSalariu(salariu);
        return  this;
    }

    public ContBuilder setCardAtasat(boolean cardAtasat) {
        this.contBancar.setCardAtasat(cardAtasat);
        return  this;
    }

    public ContBuilder setNumeClient(String numeClient) {
        this.contBancar.setNumeClient(numeClient);
        return  this;
    }

    public ContBuilder setInternet(boolean internet) {
        this.contBancar.setInternet(internet);
        return  this;
    }

}
