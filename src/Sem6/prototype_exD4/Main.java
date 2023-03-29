package Sem6.prototype_exD4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> documente=new HashMap<>();
        documente.put("CI",2);
        documente.put("Adeverinta",6);
        ContBancar contBancar=new ContBancar("Andrei",documente,8); //asta e prototipul npstru

        ContBancar contBancarCopie=(ContBancar) contBancar.cloneaza();
        System.out.println(contBancar==contBancarCopie);
        System.out.println("Obiect1: "+contBancar);
        System.out.println("Obiect2: "+contBancarCopie);
    }

}