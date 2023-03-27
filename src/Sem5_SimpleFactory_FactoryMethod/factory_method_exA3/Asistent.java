package Sem5_SimpleFactory_FactoryMethod.factory_method_exA3;


import Sem5_SimpleFactory_FactoryMethod.factory_method_exA3.PersonalSpital;
import Sem5_SimpleFactory_FactoryMethod.factory_method_exA3.PersonalSpital;

public class Asistent extends PersonalSpital {
    public Asistent(String name) {
        super(name);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Asistent " + super.getName());

    }
}
