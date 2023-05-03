package Sem10.flyweight_exD10;

public class Main {
    public static void main(String[] args){
        FlyweightFactory fabrica=new FlyweightFactory();
        Cont cont=new Cont(232333,12);
        Cont cont1=new Cont(111,13);
        Cont cont2=new Cont(983,14);


        //ne cream detinatorii fabricii
        IClientBanca detinator= fabrica.getDetinator("Ion","2133213131","xxxxx");
        detinator.descriere(cont);
        fabrica.getDetinator("Alin","234242432","242343").descriere(cont1);
        fabrica.getDetinator("Ion","2133213131","xxxxx").descriere(cont2);
        fabrica.getDetinator("Alin","234242432","242343").descriere(cont);
    }
}
