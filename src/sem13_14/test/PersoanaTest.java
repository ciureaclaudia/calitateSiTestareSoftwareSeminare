package sem13_14.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import sem13_14.model.ExceptieNenascut;
import sem13_14.model.ExceptionCNPNull;
import sem13_14.model.IPersoana;
import sem13_14.model.Persoana;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {

    @org.junit.jupiter.api.Test
    void getVarstaTestRight() {
        //testez corectitudinea
        //ce metoda testez si ce principiu testez-> numele metodei
        IPersoana persoana=new Persoana("ANdrei","1970817666666");
        assertEquals(25,persoana.getVarsta());
    }
    //la boundary noi testam pt fiecare limita din intervale

    @org.junit.jupiter.api.Test
    void getVarstaTestBoundaryNouNascut() {
        IPersoana persoana=new Persoana("ANdrei","52305247666666");
        assertEquals(0,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBoundaryLimitaInferioara() {
        IPersoana persoana=new Persoana("ANdrei","5000101666666");
        assertEquals(23,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBoundaryLimitaSuperioara() {
        IPersoana persoana=new Persoana("ANdrei","2991231666666");
        assertEquals(23,persoana.getVarsta());
    }

    //nu putem face invers,nici  crosscheck

    //error condition-> cand varsta e calculata negativ

    @org.junit.jupiter.api.Test
    void getVarstaErrorConditions() {
        IPersoana persoana=new Persoana("ANdrei","6230822666666");
        assertThrows(ExceptieNenascut.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                //apelam metoda care trebuei sa arunce exceptie
                persoana.getVarsta();
            }
        });
    }

    //Junit5
    @Test
    void getVarstaPerformance(){
        IPersoana persoana=new Persoana("ANdrei","6010817666666");
        //vedem daca varsta e calculata in 5 milisecunde
        assertTimeout(Duration.ofMillis(100),()->{
            persoana.getVarsta();
        });
    }

    //Correct - test de performance
    @Test
    void cnpCaractereCorrect(){
        Persoana persoana=new Persoana("ANdrei","6010817666666");
        //verific daca cnp ul are 13 caractere

        assertEquals(13,persoana.getCNP().length());
    }

    //Order
    @Test
    void ordineDeVarstaPersoane(){
        Persoana persoana1=new Persoana("Andrei","6001231666666");
        Persoana persoana2=new Persoana("Maria","6001231666666");
        assertTrue(persoana1.getVarsta()==persoana2.getVarsta());
    }

    //Range
    @Test
    void getVarstaShouldThrowExceptionCNPNull() {
        Persoana persoana=new Persoana("Maria", null);
        assertThrows(ExceptionCNPNull.class, ()-> persoana.getVarsta());

    }

    //boundary 1
    @Test
     void getVarstaCardinality(){
         Persoana persoana=new Persoana("Maria", "5220512666666");
         assertEquals(1,persoana.getVarsta());
     }

     //verific constructorul cu parametrii daca seteaza corect ce ii dau, testul pica daca constructorul nu seteaza corect parametrii
    //test right
    @Test
    void verificaConstructorCrossCheck(){
        Persoana persoana=new Persoana("Maria", "5220512666666");
        Persoana persoana2=new Persoana();
        persoana2.setCNP("5220512666666");
        persoana2.setNume("Maria");
        assertEquals(persoana.getCNP(),persoana2.getCNP());
        assertEquals(persoana.getNume(),persoana2.getNume());

    }



}