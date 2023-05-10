package Sem11.observer_exB12.clase;

public class Client implements IClient {
    String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String m) {
        System.out.println("Clientul "+ this.nume+ " a primit notificare: "+m);
    }
}
