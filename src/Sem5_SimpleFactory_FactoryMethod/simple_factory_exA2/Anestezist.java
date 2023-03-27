package Sem5_SimpleFactory_FactoryMethod.simple_factory_exA2;

public class Anestezist extends PersonalSpital{
    private Integer aniVechime;
    public Anestezist(String name, Integer aniVechime) {
        super(name);
        this.aniVechime=aniVechime;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Anestezistul "+ super.getName()+" ani vechime " +this.aniVechime);
    }
}
