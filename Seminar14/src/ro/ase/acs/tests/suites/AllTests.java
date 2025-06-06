package ro.ase.acs.tests.suites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import ro.ase.acs.tests.StudentCorrectTests;
import ro.ase.acs.tests.StudentRightBicepTests;

@Suite
@SelectClasses({StudentCorrectTests.class, StudentRightBicepTests.class})
public class AllTests {
}
