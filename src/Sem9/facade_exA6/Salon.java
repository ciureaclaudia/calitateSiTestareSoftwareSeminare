package Sem9.facade_exA6;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> codPatLiber;

    public Salon() {
        this.codPatLiber = new ArrayList<>();
    }

    public boolean verificarePatLiber(){
        return !codPatLiber.isEmpty(); //daca avem ceva in lista sau nu
    }

    public void adaugaPatLiber(int patLiber){
        codPatLiber.add(patLiber);
    }

    public void ocupaPat(){
        codPatLiber.remove(0);
    }
}
