package Sem11_extra.state_exF15.main;

import Sem11_extra.state_exF15.clase.Bus;
import Sem11_extra.state_exF15.clase.BusInRoute;
import Sem11_extra.state_exF15.clase.IBusState;

public class Main {
    public static void main(String[] args){
        Bus bus=new Bus("B15ABC");
        bus.goInSevice();
        bus.goInSevice();
        bus.arriveAtTheEndOfTheRoute();
        bus.arriveAtTheEndOfTheRoute();
        bus.leaveForRoute();
        bus.goInSevice();
        bus.arriveAtTheEndOfTheRoute();
    }
}
