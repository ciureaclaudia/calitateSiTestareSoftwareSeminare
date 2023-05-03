package Sem10.composite_exD9;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements IUnitateBancara {
    private String nume;
    private int nrAngajati;

    private List<IUnitateBancara> lista;

    public Sucursala(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
        this.lista = new ArrayList<>();
    }

    @Override
    public void adaugaUnitate(IUnitateBancara u) {
        lista.add(u);
    }

    @Override
    public void stergeUnitate(IUnitateBancara u) {
        lista.remove(u);
    }

    @Override
    public IUnitateBancara getUnitate(int index) {
        return lista.get(index);
    }

    @Override
    public void printDescrierere(String i) {
        System.out.println(i+"Sucursala "+ nume+ " are "+nrAngajati+" angajati ");
        for (IUnitateBancara u:lista) {
            u.printDescrierere(i+"    ");
        }
    }
}
