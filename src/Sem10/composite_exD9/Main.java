package Sem10.composite_exD9;

import javax.swing.plaf.SeparatorUI;

public class Main {
    public static  void main(String[] args){
        IUnitateBancara sucursala1=new Sucursala("SUC1",2);
        IUnitateBancara sucursala2=new Sucursala("SUC2",3);
        IUnitateBancara agentie1=new Sucursala("Agentie1",4);
        IUnitateBancara agentie2=new Sucursala("Agentie2",5);
        IUnitateBancara filiala1=new Filiala("Filiala1",20);
        IUnitateBancara filiala2=new Filiala("Filiala2",21);
        IUnitateBancara filiala3=new Filiala("Filiala3",22);

        //acum ne creeam structura ierarhica
        sucursala1.adaugaUnitate(sucursala2);
        sucursala1.adaugaUnitate(agentie1);
        sucursala1.adaugaUnitate(filiala1);


        sucursala2.adaugaUnitate(agentie2);
        sucursala2.adaugaUnitate(filiala2);


        agentie1.adaugaUnitate(filiala3);

        sucursala1.printDescrierere("    ");

    }
}
