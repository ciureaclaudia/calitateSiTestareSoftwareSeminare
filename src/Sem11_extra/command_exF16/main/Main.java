package Sem11_extra.command_exF16.main;

import Sem11_extra.command_exF16.clase.Autobuz;
import Sem11_extra.command_exF16.clase.CommandPlecareCursa;
import Sem11_extra.command_exF16.clase.IAutomobil;
import Sem11_extra.command_exF16.clase.ManagerComenzi;

public class Main {
    public static void main(String[] args){
        ManagerComenzi managerComenzi = new ManagerComenzi();

        IAutomobil autobuz = new Autobuz(13);

        managerComenzi.invocaComanda(new CommandPlecareCursa(10,new Autobuz(1)));
        managerComenzi.invocaComanda(new CommandPlecareCursa(11,autobuz));
        managerComenzi.invocaComanda(new CommandPlecareCursa(12,new Autobuz(3)));
        managerComenzi.invocaComanda(new CommandPlecareCursa(13,autobuz));


        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new CommandPlecareCursa(10,new Autobuz(23)));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}
