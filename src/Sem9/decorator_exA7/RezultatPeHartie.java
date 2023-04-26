package Sem9.decorator_exA7;

public class RezultatPeHartie implements IFurnizatrRezultat{

    @Override
    public void printeazaRezultate(String diagnostic) {
        System.out.println("Rezultatul pe hartie este(dignostic) "+ diagnostic);
    }
}
