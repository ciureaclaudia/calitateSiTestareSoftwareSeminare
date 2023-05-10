package Sem11.observer_exB12.clase;

import Sem11.observer_exB12.clase.IClient;
import Sem11.observer_exB12.clase.Irestaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Irestaurant {
    private String nume;
    private List<IClient> lista; //lista de clienti pe care ii notificam

    public Restaurant(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    @Override
    public void abonareClient(IClient client) {
        this.lista.add(client);
    }

    @Override
    public void dezabonareClient(IClient client) {
        this.lista.remove(client);
    }


    @Override
    public void notificareClienti(String mesaj) {
        for (IClient c : lista) {
            c.primesteNotificare(mesaj);
        }
    }

    public void introduceOfertaNoua(){
        String mesaj=new String(this.nume+" a introdus oferata noua");
        notificareClienti(mesaj);
    }

    public void adaugaDiscount(int p){
        String mesaj =new String(this.nume+" a introdus un discount de "+p +"%");
    }
}
