package sem13_14.test;

import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import sem13_14.model.PachetTuristic;
import sem13_14.dubluri.FakePersoana;
import sem13_14.suite.Tag1;
import sem13_14.suite.Tag2;

import static org.junit.jupiter.api.Assertions.*;

public class AplicaDiscountTest {
    @Category(Tag1.class)
    @Tag("tag1")
   @Test
    void testNuSeAplicaDiscount(){
       FakePersoana pf=new FakePersoana();
       pf.setGetVarsta(6);
       PachetTuristic pachetTuristic=new PachetTuristic(pf,"sasas",1000.0);
       pachetTuristic.aplicaDiscountVarstnici(70);
       assertEquals(1000,pachetTuristic.getPret());

   }
    @Category(Tag2.class)
    @Tag("tag2")
    @Test
    void testAplicaDiscount(){
        FakePersoana pf=new FakePersoana();
        pf.setGetVarsta(86);
        PachetTuristic pachetTuristic=new PachetTuristic(pf,"sasas",1000.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(900,pachetTuristic.getPret());
    }
}