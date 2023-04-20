package Sem8.adapterObiecteClase_exB5.bucatarie;

import Sem8.adapterObiecteClase_exB5.bar.SoftBar;

public class AdapterRestaurant extends SoftBar implements ISoftRestaurant {

    //adapter de clase
    public AdapterRestaurant(String denumire) {
        super(denumire);
    }

    @Override
    public void printeazaNota(double totalSuma) {
        super.printeazaNotaBautura(totalSuma);
    }
}
