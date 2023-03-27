package Sem5_SimpleFactory_FactoryMethod.simple_factory_exA2.main;


import Sem5_SimpleFactory_FactoryMethod.simple_factory_exA2.PersonalSpital;
import Sem5_SimpleFactory_FactoryMethod.simple_factory_exA2.SimpleFactory;
import Sem5_SimpleFactory_FactoryMethod.simple_factory_exA2.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PersonalSpital> personalSpitalList=new ArrayList<>();

        SimpleFactory simpleFactory=new SimpleFactory();
        PersonalSpital personalSpital1=simpleFactory.createPersonal(TipPersonal.Medic, "Andrei");
        PersonalSpital personalSpital2=simpleFactory.createPersonal(TipPersonal.Asistent,"Gigi");
        PersonalSpital personalSpital3=simpleFactory.createPersonal(TipPersonal.Brancardier,"Costel");
        PersonalSpital personalSpital4=simpleFactory.createPersonal(TipPersonal.Medic,"Radu");
        PersonalSpital personalSpital5=simpleFactory.createPersonal(TipPersonal.Anestezist,"Mihai",20);

        personalSpitalList.addAll(List.of(personalSpital1,personalSpital2,personalSpital3,personalSpital4,personalSpital5));

        for(PersonalSpital personalSpital: personalSpitalList){
            personalSpital.afiseazaDescriere();
        }
    }
}