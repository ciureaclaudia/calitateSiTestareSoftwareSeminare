package Sem8.adapterObiecteClase_exB5.bucatarie;

public class Bucatarie implements  ISoftRestaurant{
    private String denumireBucatar;

    public Bucatarie(String denumireBucatar) {
        this.denumireBucatar = denumireBucatar;
    }

    @Override
    public void printeazaNota(double totalSuma) {
        System.out.println("Bucatar "+ this.denumireBucatar);
        System.out.println("Nota de plata "+ totalSuma);
    }
}
