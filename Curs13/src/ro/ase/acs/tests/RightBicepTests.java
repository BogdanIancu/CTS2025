package ro.ase.acs.tests;

import org.junit.*;
import org.junit.experimental.categories.Category;
import ro.ase.acs.classes.Operations;
import ro.ase.acs.exceptions.NullArrayException;
import ro.ase.acs.tests.categories.VeryImportant;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RightBicepTests {
    private Operations operations;

    @BeforeClass
    public static void initializeClass() {
        System.out.println("Before All");
    }

    @AfterClass
    public static void uninitializeClass() {
        System.out.println("After All");
    }

    @Before
    public void initializeOperations() {
        System.out.println("Before");
        operations = new Operations();
    }

    @After
    public void uninitializeOperations() {
        System.out.println("After");
        operations = null;
    }

    @Category(VeryImportant.class)
    @Test
    public void additionRightTest() throws NullArrayException {
        double result = operations.addition(500, -500, 499, 498, -499);

        assertEquals("The result should be 0 for empty array", 498, result, 0.009);
    }

    @Test
    public void additionBoundaryTest1() throws NullArrayException {
        double result = operations.addition(Double.MAX_VALUE, -0.01);
        double expected = Double.MAX_VALUE - 1 + 0.99;
        assertEquals("The value before max boundary is not correct", expected, result, 0.009);
    }

    @Test
    public void additionBoundaryTest2() throws NullArrayException {
        double result = operations.addition(Double.MAX_VALUE - 1, 1);
        assertEquals("The value before max boundary is not correct", Double.MAX_VALUE, result, 0.009);
    }

    @Test
    public void additionBoundaryTest3() throws NullArrayException {
        double result = operations.addition(Double.MAX_VALUE, 1);
        assertEquals("The value before max boundary is not correct", Double.MAX_VALUE, result, 0.009);
    }

    @Test
    public void additionInverseTest() throws NullArrayException {
        double[] values = new double[]{7, 90, 45.55, 35.45};
        double result = operations.addition(values);
        for (double value : values) {
            result -= value;
        }

        assertEquals("The inverse operation didn't succeed", 0, result, 0.009);
    }

    @Test
    public void additionCrosscheckTest() throws NullArrayException {
        double[] values = new double[]{7, 90, 45.55, 35.45};
        double result = operations.addition(values);
        double actual = Arrays.stream(values).sum();

        assertEquals("The inverse operation didn't succeed", actual, result, 0.009);
    }

    @Test
    public void additionErrorConditionTest() throws NullArrayException {
        assertThrows("No exception for null array", NullArrayException.class,
                () -> operations.addition(null));
    }

    @Test(timeout = 1)
    public void additionPerformanceTest() throws NullArrayException {
        Operations operations = new Operations();
        double[] array = new double[10_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        operations.addition(array);
    }

}
