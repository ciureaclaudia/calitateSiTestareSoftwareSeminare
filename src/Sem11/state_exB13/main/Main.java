package Sem11.state_exB13.main;


import Sem11.state_exB13.clase.Masa;

public class Main {
    public static void main(String[] args){
        Masa masa = new Masa(1);

        masa.ocupareMasa();
        masa.ocupareMasa();

        masa.rezervaMasa();
        masa.elibereazaMasa();

    }
}
