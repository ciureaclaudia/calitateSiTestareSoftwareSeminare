package Sem11.template_exB14.main;

import Sem11.template_exB14.clase.AbstractMasa;
import Sem11.template_exB14.clase.Masa;
import Sem11.template_exB14.clase.MasaRezervata;

public class Main {
    public static void main(String[] args) {
        AbstractMasa masa = new Masa(1);
        masa.ocupaMesa();

        AbstractMasa masaRezervata = new MasaRezervata(2,"14:30");

        masaRezervata.ocupaMesa();

    }
}
