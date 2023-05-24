package Sem11_extra.strategy_exF10.main;

import Sem11_extra.strategy_exF10.clase.Calator;
import Sem11_extra.strategy_exF10.clase.PataCardBancar;
import Sem11_extra.strategy_exF10.clase.PataSMS;

public class Main {
    public static void main(String[] args){
        Calator calator=new Calator("Ana");

        calator.platesteBilet(2);
        calator.setTipPlata(new PataSMS());
        calator.platesteBilet(3);
        calator.setTipPlata(new PataCardBancar());
        calator.platesteBilet(25);
    }


}
