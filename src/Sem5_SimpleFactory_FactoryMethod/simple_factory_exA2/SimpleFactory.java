package Sem5_SimpleFactory_FactoryMethod.simple_factory_exA2;


public class SimpleFactory {
    public PersonalSpital createPersonal(TipPersonal tipPersonal,String name){
        switch (tipPersonal){
            case Medic: return new Medic(name);
            case Asistent: return  new Asistent(name);
            case Brancardier:return  new Brancardier(name);
            default: return null;
        }
    }

    public PersonalSpital createPersonal(TipPersonal tipPersonal,String name, Integer aniVechime){
        switch (tipPersonal){

            case Anestezist:return new Anestezist(name, aniVechime);
            default: return createPersonal(tipPersonal, name);
        }
    }
}
