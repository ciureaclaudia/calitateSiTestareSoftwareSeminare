package Sem8.adapterObiecteClase_exB5.main;

import Sem8.adapterObiecteClase_exB5.bar.ISoftBar;
import Sem8.adapterObiecteClase_exB5.bar.SoftBar;
import Sem8.adapterObiecteClase_exB5.bucatarie.AdapterObiecteRestaurant;
import Sem8.adapterObiecteClase_exB5.bucatarie.AdapterRestaurant;
import Sem8.adapterObiecteClase_exB5.bucatarie.Bucatarie;
import Sem8.adapterObiecteClase_exB5.bucatarie.ISoftRestaurant;

public class Main {

    public static void imprimare(ISoftRestaurant restaurant,double nota){
        restaurant.printeazaNota(nota);

    }
    public static void main(String[] args){
        ISoftBar bar=new SoftBar("AnanasaBAR");
        bar.printeazaNotaBautura(238);

        ISoftRestaurant bucatarie=new Bucatarie("Matei");
        bucatarie.printeazaNota(132);

//        Main.imprimare(bar,230);  -> nu merge, de accea avem adapter
        AdapterRestaurant adapter=new AdapterRestaurant("CocoBAR");
        Main.imprimare(adapter,232);

        //adapter de obiecte
        AdapterObiecteRestaurant adapterObiecte=new AdapterObiecteRestaurant(bar);
        imprimare(adapterObiecte,532);
    }


}
