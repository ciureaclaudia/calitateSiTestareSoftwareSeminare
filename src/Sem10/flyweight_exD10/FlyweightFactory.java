package Sem10.flyweight_exD10;

import Sem10.composite_exD9.Filiala;

import javax.swing.*;
import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String,IClientBanca> mapCont;
    public FlyweightFactory(){
        mapCont=new HashMap<>();
    }

    public IClientBanca getDetinator(String nume, String nrTel, String adresa){
        if(!mapCont.containsKey(nume)){
            IClientBanca clientBanca=new Detinator(nume,nrTel,adresa);
            mapCont.put(nume,clientBanca);

        }
        return mapCont.get(nume);
    }


}
