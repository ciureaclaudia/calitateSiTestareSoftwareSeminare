package Sem8.adapterObiecteClase_exB5.bar;

import Sem8.adapterObiecteClase_exB5.bar.ISoftBar;

public class SoftBar implements ISoftBar {
    private String denumire;


    public SoftBar(String denumire) {
        this.denumire = denumire;

    }

    @Override
    public void printeazaNotaBautura(double plata) {
        System.out.println("Barul "+ this.denumire +" nota de plata " +plata);
    }
}
