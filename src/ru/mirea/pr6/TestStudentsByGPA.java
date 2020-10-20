package ru.mirea.pr6;

import java.util.Random;

public class TestStudentsByGPA {
    public static void main(String[] args){
        Student[] students=new Student[10];
        Random rand=new Random();
        for (int i = 0; i < 10; i++) {
            students[i] = new Student(rand.nextInt(100),rand.nextInt(100));
            System.out.print(students[i].getGrade() + " ");
        }
        System.out.println("\nSorted array:");
        SortingStudentsByGPA s = new SortingStudentsByGPA();
        s.quickSort(students, 0, students.length-1);
        for (Student student : students) {
            System.out.print(student.getGrade() + " ");
        }

    }
}
