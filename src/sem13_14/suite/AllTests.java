package sem13_14.suite;

import org.junit.runners.Suite;
import sem13_14.model.AgentieTurism;
import sem13_14.model.Persoana;
import sem13_14.test.AplicaDiscountTest;
import sem13_14.test.PoateRezervaTest;

@Suite.SuiteClasses({AplicaDiscountTest.class, PoateRezervaTest.class}) // am creat o suita in care se vor rula toate testele din aceste clase
public class AllTests {


}
