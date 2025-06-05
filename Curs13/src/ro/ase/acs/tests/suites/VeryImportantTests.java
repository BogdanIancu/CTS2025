package ro.ase.acs.tests.suites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.acs.tests.categories.VeryImportant;

@RunWith(Categories.class)
@Categories.IncludeCategory({VeryImportant.class})
@Suite.SuiteClasses(AllTests.class)
public class VeryImportantTests {
}
