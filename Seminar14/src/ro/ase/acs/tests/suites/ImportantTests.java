package ro.ase.acs.tests.suites;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import ro.ase.acs.tests.StudentRightBicepTests;

@Suite
@SelectClasses(StudentRightBicepTests.class)
@IncludeTags("important")
public class ImportantTests {
}
