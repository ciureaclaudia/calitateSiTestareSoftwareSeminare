package Sem5_SimpleFactory_FactoryMethod.factory_method_exA3;


public class Medic extends PersonalSpital {
    public Medic(String name) {
        super(name);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Medic " + super.getName());

    }
}
