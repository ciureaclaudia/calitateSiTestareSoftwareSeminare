package Sem8.proxy_exB9.main;

import Sem8.proxy_exB9.clase.Irestaurant;
import Sem8.proxy_exB9.clase.ProxyRestaurant;
import Sem8.proxy_exB9.clase.Restaurant;

public class Main {
    public static void main(String[] args){
        Irestaurant irestaurant=new Restaurant("dwsd");
        irestaurant.rezervaMasa(2);
        System.out.println();

        Irestaurant proxy=new ProxyRestaurant(irestaurant);
        proxy.rezervaMasa(2);
        System.out.println();
        proxy.rezervaMasa(5);
    }
}
