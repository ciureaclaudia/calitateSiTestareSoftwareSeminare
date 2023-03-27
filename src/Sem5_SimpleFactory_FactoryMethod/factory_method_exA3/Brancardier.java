package Sem5_SimpleFactory_FactoryMethod.factory_method_exA3;

import Sem5_SimpleFactory_FactoryMethod.factory_method_exA3.PersonalSpital;
import Sem5_SimpleFactory_FactoryMethod.factory_method_exA3.PersonalSpital;

public class Brancardier extends PersonalSpital {

    public Brancardier(String name){
        super(name);

    }
    public void afiseazaDescriere(){
        System.out.println("Brancardierul " + super.getName());
    }
}
