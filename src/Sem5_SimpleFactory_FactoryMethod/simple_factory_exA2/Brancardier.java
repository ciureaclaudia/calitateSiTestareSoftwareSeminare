package Sem5_SimpleFactory_FactoryMethod.simple_factory_exA2;

public class Brancardier extends PersonalSpital {

    public Brancardier(String name){
        super(name);

    }
    public void afiseazaDescriere(){
        System.out.println("Brancardierul " + super.getName());
    }
}
