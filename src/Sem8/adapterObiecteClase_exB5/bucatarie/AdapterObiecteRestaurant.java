package Sem8.adapterObiecteClase_exB5.bucatarie;

import Sem8.adapterObiecteClase_exB5.bar.ISoftBar;

public class AdapterObiecteRestaurant implements ISoftRestaurant{
   //adapter de obiecte
    private ISoftBar softBar;

    public AdapterObiecteRestaurant(ISoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaNota(double totalSuma) {
        this.softBar.printeazaNotaBautura(totalSuma);
    }
}
