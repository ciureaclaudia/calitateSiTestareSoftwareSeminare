package Sem11_extra.strategy_exF10.clase;

public class Calator {
    private String nume;
    private ITipPlata tipPlata;

    public Calator(String nume) {
        this.nume = nume;
        this.tipPlata=new PataCardCalatorii(); //by default
    }

    //setter si getter pt obiect abstract si ii las publici ca trebuie modificati in main
    // schimbarea strategiei, fata de STATE, unde erau privati

    public ITipPlata getTipPlata() {
        return tipPlata;
    }

    public void setTipPlata(ITipPlata tipPlata) {
        this.tipPlata = tipPlata;
    }

    //apelez functionalitatea din strategia pe care am setat-o
    public void platesteBilet(double tarifBilet){
        this.tipPlata.plateste(tarifBilet);
    }


}
