package sem13_14.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runners.Suite;
import sem13_14.test.AplicaDiscountTest;
import sem13_14.test.PoateRezervaTest;

@Suite.SuiteClasses({AplicaDiscountTest.class, PoateRezervaTest.class}) // am creat o suita in care se vor rula toate testele din aceste clase
@Categories.IncludeCategory({Tag1.class, Tag2.class})   //Junit4
public class SuitaCustom {


}
