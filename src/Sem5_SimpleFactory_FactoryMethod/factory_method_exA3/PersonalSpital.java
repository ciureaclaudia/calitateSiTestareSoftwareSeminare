package Sem5_SimpleFactory_FactoryMethod.factory_method_exA3;

public abstract class PersonalSpital {
    private String name;

    public PersonalSpital(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract void  afiseazaDescriere();
}
