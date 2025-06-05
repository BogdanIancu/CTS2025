package ro.ase.acs.tests.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.acs.tests.CorrectTests;
import ro.ase.acs.tests.RightBicepTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({CorrectTests.class, RightBicepTests.class})
public class AllTests {
}
