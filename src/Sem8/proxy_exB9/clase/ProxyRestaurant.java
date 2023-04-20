package Sem8.proxy_exB9.clase;

public class ProxyRestaurant implements Irestaurant{

    private Irestaurant irestaurant;

    public ProxyRestaurant(Irestaurant irestaurant) {
        this.irestaurant = irestaurant;
    }

    @Override
    public void rezervaMasa(int nrPers) {
        if(nrPers>=4){
            this.irestaurant.rezervaMasa(nrPers);
        } else {
            System.out.println("rezervarea nu a putut fi facuta");
        }
    }
}
