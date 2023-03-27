package Sem5_SimpleFactory_FactoryMethod.factory_method_exA3.main;

import Sem5_SimpleFactory_FactoryMethod.factory_method_exA3.fabrici_concrete.FactoryBrancardier;
import Sem5_SimpleFactory_FactoryMethod.factory_method_exA3.fabrici_concrete.FactoryMedic;
import Sem5_SimpleFactory_FactoryMethod.factory_method_exA3.PersonalSpital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactoryMedic factoryMedic=new FactoryMedic();
        FactoryBrancardier factoryBrancardier=new FactoryBrancardier();
        List<PersonalSpital> list =new ArrayList<>();
        list.add(factoryMedic.createPersonal("A"));
        list.add(factoryMedic.createPersonal("B"));


        for(PersonalSpital personalSpital: list){
            personalSpital.afiseazaDescriere();
        }

    }
}