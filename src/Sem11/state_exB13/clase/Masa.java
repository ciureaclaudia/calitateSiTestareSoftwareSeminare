package Sem11.state_exB13.clase;


import Sem11.state_exB13.clase.IStare;
import Sem11.state_exB13.clase.StareLibera;
import Sem11.state_exB13.clase.StareOcupata;
import Sem11.state_exB13.clase.StareRezervata;

public class Masa {
    private int nr;
    private IStare stare;

    public Masa(int nr) {
        this.nr = nr;
        this.stare = new StareLibera();
    }

    protected void setStare(IStare s){
        this.stare=s;
    }

    public int getNr() {
        return nr;
    }

    public IStare getStare() {
        return stare;
    }

    public void ocupareMasa(){
        IStare stare = new StareOcupata();
        stare.modificaStare(this);
    }

    public void rezervaMasa(){
        IStare stare = new StareRezervata();
        stare.modificaStare(this);
    }

    public void elibereazaMasa(){
        IStare stare = new StareLibera();
        stare.modificaStare(this);
    }

    public void anuleazaRezervare(){
        IStare stare = new StareLibera();
        stare.modificaStare(this);
    }
}
