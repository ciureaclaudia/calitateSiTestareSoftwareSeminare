package Sem4_Singleton.singletonRegistry.main;

import Sem4_Singleton.singletonRegistry.InstitutiePublica;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        InstitutiePublica politie = InstitutiePublica.getInstance("Politie");
        InstitutiePublica pompieri = InstitutiePublica.getInstance("Pompieri");
        InstitutiePublica politieLocala = InstitutiePublica.getInstance("PolitieLocala");
        politie.setNumarAngajati(20);
        politieLocala.setNumarAngajati(10);
        pompieri.setNumarAngajati(30);
        System.out.println(politieLocala);
        System.out.println(politie);
        System.out.println(pompieri);
    }
}
