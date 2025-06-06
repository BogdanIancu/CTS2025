package ro.ase.acs.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import ro.ase.acs.classes.AbstractFileWriter;
import ro.ase.acs.classes.Student;
import ro.ase.acs.exceptions.NullNameException;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class StudentRightBicepTests {
    private Student student;
    private double average = 0;

    @BeforeEach
    public void initialize() {
        student = new Student();
    }

    @AfterEach
    public void resetAverage() {
        average = 0;
    }

    @Test
    @Tag("important")
    public void computeAverageRightTest() {
        student.setGrades(new int[]{9, 10, 10});
        average = student.computeAverage();
        assertEquals(9.66, average, 0.009,
                "The average is not right");
    }

    @Test
    public void computeAverageLeftBoundaryTest1() {
        int[] grades = new int[100];
        for (int i = 0; i < 100; i++) {
            grades[i] = 1;
        }
        grades[0] = 0;
        student.setGrades(grades);
        average = student.computeAverage();

        assertEquals(1, average, 0.009, "The left boundary is not correct");
    }

    @Test
    public void computeAverageLeftBoundaryTest2() {
        int[] grades = new int[]{1, 1, 1, 1, 1, 1, 1};
        student.setGrades(grades);
        average = student.computeAverage();

        assertEquals(1, average, 0.009, "The left boundary is not correct");
    }

    @Test
    public void computeAverageInverseRelationshipTest() {
        int[] grades = new int[]{9, 9, 10};
        student.setGrades(grades);
        average = student.computeAverage();
        double sum = Arrays.stream(grades).sum();
        assertEquals(sum, average * grades.length, 0.01, "The inverse relationship is not met");
    }

    @Test
    public void computeAverageCrosscheckTest() {
        int[] grades = new int[]{9, 9, 10, 6, 3, 4, 9, 10};
        student.setGrades(grades);
        average = student.computeAverage();

        double expectedAverage = Arrays.stream(grades).average().orElse(0);
        assertEquals(expectedAverage, average, 0.009, "The crosscheck didn't match");
    }

    @Test
    public void setNameErrorConditionTest() {
        assertThrowsExactly(NullNameException.class, () -> student.setName(null),
                "Didn't receive the expected exception");
    }

    @Test
    @Tag("important")
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void computeAveragePerformanceTest() {
        int[] grades = new int[1_000_000];
        for (int i = 0; i < 1_000_000; i++) {
            grades[i] = 10;
        }
        student.setGrades(grades);
        average = student.computeAverage();
    }

    @Test
    public void givenStudentWhenSaveIsCalledThenWriteShouldBeCalled() {
        final boolean[] isMethodCalled = new boolean[]{false};

        student.setFileWriter(o -> isMethodCalled[0] = true);

        student.save();
        assertTrue(isMethodCalled[0], "The write method is not called when save is called");
    }

}
