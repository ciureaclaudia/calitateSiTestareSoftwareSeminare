package Sem10.composite_exD9;

public class Filiala implements IUnitateBancara{
    private String nume;
    private int nrAngajati;

    public Filiala(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    //aruncam exceptii ca aici suntem in clasa frunza si nu ne trebuie aceste metode
    @Override
    public void adaugaUnitate(IUnitateBancara u) {
        throw new RuntimeException();
    }

    @Override
    public void stergeUnitate(IUnitateBancara u) {
        throw new RuntimeException();
    }

    @Override
    public IUnitateBancara getUnitate(int index) {
        throw new RuntimeException();
    }

    @Override
    public void printDescrierere(String i) {
        System.out.println(i+"Filiala "+nume+" are "+nrAngajati+" nr angajati");
    }
}
