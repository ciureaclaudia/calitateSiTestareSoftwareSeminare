package Sem11_extra.strategy_exF10.clase;

public class PataSMS implements ITipPlata {
    @Override
    public void plateste(double pretBilet) {
        System.out.println("Plata de "+pretBilet+" a fost facuta cu SMS");
    }
}
