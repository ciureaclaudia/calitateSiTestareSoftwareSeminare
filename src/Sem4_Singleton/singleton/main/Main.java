package Sem4_Singleton.singleton.main;


import Sem4_Singleton.singleton.BazeDate;
import Sem4_Singleton.singleton.Secretariat;

public class Main {
    public Main(){}
    public static void main(String[] args) {
        Secretariat secretariat1 = Secretariat.getInstance(1, 10);
        Secretariat secretariat2 = Secretariat.getInstance(2, 40);
        System.out.println(secretariat1);
        System.out.println(secretariat2);
        BazeDate bazeDate = BazeDate.getInstance();
        BazeDate bazeDate1 = BazeDate.getInstance();
        System.out.println(bazeDate);
        System.out.println(bazeDate1);
        bazeDate.setDimensiuneDate(200);
        bazeDate1.setDimensiuneDate(300);
        System.out.println(bazeDate);
        System.out.println(bazeDate1);
    }
}
