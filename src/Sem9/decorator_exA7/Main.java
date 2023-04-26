package Sem9.decorator_exA7;

public class Main {
    public static void main(String[] args){
        IFurnizatrRezultat rezultatPeHartie=new RezultatPeHartie();
        rezultatPeHartie.printeazaRezultate("Racela, printat pe hartie");

            RezultatOnline_DecoratorAbstract decoratorAbstract=new RezultatOnline_DecoratorConcret(rezultatPeHartie);
            decoratorAbstract.afisareRezultatOnline("racela, online");
            decoratorAbstract.printeazaRezultate("gripa");

    }
}
