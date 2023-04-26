package Sem9.decorator_exA7;

public  class RezultatOnline_DecoratorConcret extends RezultatOnline_DecoratorAbstract{
    private IFurnizatrRezultat atr; //instanta a produsului concret

    public RezultatOnline_DecoratorConcret(IFurnizatrRezultat atr) {
        super(atr);

    }

    //implementez metoda abstracta din decoratorul abstract
    public  void afisareRezultatOnline(String diagnostic){
        System.out.println("diagnostic "+diagnostic);
    }
}
