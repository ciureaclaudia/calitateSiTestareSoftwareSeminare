package Sem11.observer_exB12.main;

import Sem11.observer_exB12.clase.Client;
import Sem11.observer_exB12.clase.IClient;
import Sem11.observer_exB12.clase.Restaurant;

public class Main {
    public static void main(String[] args){
            IClient client=new Client("A");
            IClient client1=new Client("B");

            Restaurant restaurant=new Restaurant("dass");
            restaurant.introduceOfertaNoua();

            restaurant.abonareClient(client);
            restaurant.adaugaDiscount(25);


    }
}
