package ro.ase.acs.tests;

import org.junit.Ignore;
import org.junit.experimental.categories.Category;
import ro.ase.acs.classes.Operations;
import org.junit.Test;
import ro.ase.acs.exceptions.NullArrayException;
import ro.ase.acs.tests.categories.VeryImportant;

import static org.junit.Assert.*;

public class CorrectTests {
    @Test
    public void givenTwoValidIntegerWhenSumIsCalledThenResultShouldBeCorrect() {
        //Arrange
        Operations operations = new Operations();
        int x = 5;
        int y = 7;
        //Act
        double result = operations.sum(x, y);
        //Assert
        assertEquals("The sum is not correct for two integers", 12, result, 0.009);
    }

    @Test
    public void givenTwoOppositeIntegersWhenSumIsCalledTheResultShouldBeZero() {
        Operations operations = new Operations();
        int x = -7;
        int y = 7;
        double result = operations.sum(x, y);
        assertEquals("The sum is not correct for two opposite integers", 0, result, 0.009);
    }

    @Category(VeryImportant.class)
    @Test
    public void additionConformanceTest() {
        Operations operations = new Operations();
        double result = 0;
        try {
            result = operations.addition(1.3333, 2.6666);
        } catch (NullArrayException e) {
            fail(e.getMessage());
        }
        assertEquals("The sum is not conform", 4.00, result, 0.000009);
    }

    @Category(VeryImportant.class)
    @Test
    public void additionOrderingTest() throws NullArrayException {
        Operations operations = new Operations();
        double result1 = operations.addition(1, 2, 3, 4, 5);
        double result2 = operations.addition(5, 3, 2, 1, 4);

        assertEquals("The ordering affects the sum", result1, result2, 0.009);

    }

    @Test
    public void additionRangeTest() {
        Operations operations = new Operations();
        double result = 0;
        try {
            result = operations.addition(Double.MAX_VALUE, 1);
        } catch (NullArrayException e) {
            fail(e.getMessage());
        }

        assertEquals("The ordering affects the sum", Double.MAX_VALUE, result, 0.009);
    }


    @Test(expected = NullArrayException.class)
    public void additionReferenceTest() throws NullArrayException {
        Operations operations = new Operations();
        double[] values = null;
        operations.addition(values);
    }

    @Test
    public void additionExistenceTest() throws NullArrayException {
        Operations operations = new Operations();
        double result = operations.addition();

        assertEquals("The result should be 0 for empty array", 0, result, 0.009);
    }

    @Test
    public void additionCardinality1Test() throws NullArrayException {
        Operations operations = new Operations();
        double result = operations.addition(100);

        assertEquals("The result should be 0 for empty array", 100, result, 0.009);
    }

    @Test(timeout = 1)
    public void additionCardinalityNTest() throws NullArrayException {
        Operations operations = new Operations();
        double[] array = new double[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = i + 1;
        }
        double result = operations.addition(array);

        assertEquals("The result should be 0 for empty array", 500500, result, 0.009);
    }
}
