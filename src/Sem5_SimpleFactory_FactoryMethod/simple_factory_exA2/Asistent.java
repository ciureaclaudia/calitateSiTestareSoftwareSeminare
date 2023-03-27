package Sem5_SimpleFactory_FactoryMethod.simple_factory_exA2;

public class Asistent extends PersonalSpital {
    public Asistent(String name) {
        super(name);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Asistent " + super.getName());

    }
}
