package ro.ase.acs.classes;

import ro.ase.acs.exceptions.NullGradesArrayException;

import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private int[] grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getGrades() {
        return grades != null ? grades.clone() : null;
    }

    public void setGrades(int[] grades) {
        if (grades != null) {
            this.grades = Arrays.copyOf(grades, grades.length);
        }
    }

    public double computeAverage() {
        if(grades == null) {
            throw new NullGradesArrayException();
        }
        double sum = 0;
        for (int i : grades) {
            sum += i;
        }
        double average = sum / grades.length;
        average = Math.floor(average * 100) / 100;
        if(average < 1 || grades.length == 0) {
            average = 1;
        }
        if(average > 10) {
            average = 10;
        }
        return average;
    }
}
