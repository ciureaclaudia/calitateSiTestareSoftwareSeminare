package sem13_14.test;

import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import sem13_14.model.PachetTuristic;
import sem13_14.dubluri.StubPersoana;
import sem13_14.dubluri.StubPersoanaMajora;
import sem13_14.suite.Tag1;
import sem13_14.suite.Tag2;

import static org.junit.jupiter.api.Assertions.*;

public class PoateRezervaTest {
    @Category(Tag1.class)
    @Tag("tag1")
    @Test
    void unMinorNuPoateRezerva(){
        StubPersoana stubPersoana=new StubPersoana();
        PachetTuristic pachetTuristic=new PachetTuristic(stubPersoana,"Bucuresti",29.3);
        assertFalse(pachetTuristic.poateRezerva());
    }

    @Category(Tag2.class)
    @Tag("tag2")
    @Test
    void unMajorPoateRezerva(){
        StubPersoanaMajora stubPersoanaMajora=new StubPersoanaMajora();
        PachetTuristic pachetTuristic=new PachetTuristic(stubPersoanaMajora,"Bucuresti",29.3);
        assertTrue(pachetTuristic.poateRezerva());
    }




}