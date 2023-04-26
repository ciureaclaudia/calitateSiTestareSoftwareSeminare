package Sem9.decorator_exA7;

public abstract class RezultatOnline_DecoratorAbstract implements IFurnizatrRezultat{
    private IFurnizatrRezultat atr; //instanta a produsului concret

    public RezultatOnline_DecoratorAbstract(IFurnizatrRezultat atr) {
        this.atr = atr;
    }

    @Override
    public  void printeazaRezultate(String diagnostic){
        atr.printeazaRezultate(diagnostic);
    }

    public abstract void afisareRezultatOnline(String diagnostic); //pt decoratorul concret care implementeaza clasa abstracta
}
