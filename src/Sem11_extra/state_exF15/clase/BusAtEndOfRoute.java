package Sem11_extra.state_exF15.clase;

public class BusAtEndOfRoute implements IBusState {
    //in fiecare schimbare de stare
    // trebuie sa verificam daca putem aduce obiectul in acea stare
    @Override
    public void changeState(Bus bus) {
        //verific starea in care se afla acum
        if (!(bus.getState() instanceof BusAtEndOfRoute)) {
            System.out.println("Autobuzul " + bus.getLicensePlate() + " a ajuns la captat de linie ");
            //acum putem sa i modificam stareaa
            bus.setState(this);
        } else {
            System.out.println("Autobuzul nu e in cursa, nu poate ajunge la capt de line");
        }

    }
}
