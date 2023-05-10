package Sem11.observer_exB12.clase;

import Sem11.observer_exB12.clase.IClient;

public interface Irestaurant {
    void abonareClient(IClient client);
    void dezabonareClient(IClient client);
    void notificareClienti(String mesaj);


}
