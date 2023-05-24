package Sem8.proxy_exB9.clase;

public class Restaurant implements Irestaurant{
    private String nume;

    public Restaurant(String nume) {
        this.nume = nume;
    }

    @Override
    public void rezervaMasa(int nrPers) {
        System.out.println("Masa a fost rezervata pt "+ nrPers+" la restaurantul "+ nume);
    }
}
