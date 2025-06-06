package ro.ase.acs.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import ro.ase.acs.classes.Student;
import ro.ase.acs.exceptions.NullGradesArrayException;

public class StudentCorrectTests {
    @Test
    public void givenStudentClassWhenDefaultConstructorIsCalledThenGradesShouldBeNull() {
        Student s = new Student();
        assertNull(s.getGrades(), "The grades is not null by default");
    }

    @Test
    public void computeAverageConformanceTest() {
        Student s = new Student();
        s.setGrades(new int[]{9, 10, 10});
        double average = s.computeAverage();
        assertEquals(9.66, average, 0.009, "The average is not conform");
    }

    @Test
    public void computeAverageOrderingTest() {
        Student s1 = new Student();
        s1.setGrades(new int[]{9, 10, 10, 7, 5});
        Student s2 = new Student();
        s2.setGrades(new int[]{5, 7, 9, 10, 10});
        double average1 = s1.computeAverage();
        double average2 = s2.computeAverage();
        assertEquals(average1, average2, 0.009, "The grades order influences the average");
    }

    @Test
    public void computeAverageRangeMinTest() {
        Student s = new Student();
        s.setGrades(new int[]{0, 1, 1});
        double average = s.computeAverage();
        assertEquals(1, average, 0.009, "The min average is not 1");
    }

    @Test
    public void computeAverageRangeMaxTest() {
        Student s = new Student();
        s.setGrades(new int[]{10, 10, 11});
        double average = s.computeAverage();
        assertEquals(10, average, 0.009, "The max average is not 10");
    }

    @Test
    public void computeAverageReferenceTest() {
        Student s = new Student();
        assertThrows(NullGradesArrayException.class, () -> s.computeAverage(),
                "There is no exception for null grades array");
    }

    @Test
    public void computeAverageExistenceTest() {
        Student s = new Student();
        s.setGrades(new int[]{});
        double average = s.computeAverage();
        assertEquals(1, average, 0.009, "The average is not 1 for no grades");
    }

    @Test
    public void computeAverageCardinalityOneTest() {
        Student s = new Student();
        s.setGrades(new int[]{8});
        double average = s.computeAverage();
        assertEquals(8, average, 0.009, "The average is not correct for one grade");
    }

    @Test
    public void computeAverageCardinalityNTest() {
        Student s = new Student();
        int[] grades = new int[100];
        for (int i = 0; i < 50; i++) {
            grades[i] = 7;
            grades[50 + i] = 8;
        }
        s.setGrades(grades);
        double average = s.computeAverage();
        assertEquals(7.5, average, 0.009, "The average is not correct for maximum number of grade");
    }

    @Test
    @Timeout(1)
    public void computeAverageTimeTest() {
        Student s = new Student();
        s.setGrades(new int[1_000_000]);
        s.computeAverage();
    }
}
