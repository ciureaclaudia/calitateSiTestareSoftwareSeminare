package Sem11_extra.strategy_exF10.clase;

public class PataCardCalatorii implements ITipPlata {
    @Override
    public void plateste(double pretBilet) {
        System.out.println("Plata de "+pretBilet+" a fost facuta cu Cardul de calatorie");
    }
}
