package Sem5_SimpleFactory_FactoryMethod.simple_factory_exA2;

public class Medic extends PersonalSpital {
    public Medic(String name) {
        super(name);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Medic " + super.getName());

    }
}
