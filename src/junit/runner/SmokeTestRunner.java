package junit.runner;

import junit.groups.MariaTest;
import junit.tests.DivisionTest;
import junit.tests.ModuloTest;
import junit.tests.MulTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(MariaTest.class)
@Suite.SuiteClasses({DivisionTest.class, ModuloTest.class, MulTest.class})
public class SmokeTestRunner {

}
