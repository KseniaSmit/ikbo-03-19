package ru.mirea.pr9.SecondTask;

import java.util.Random;

public class LabClassDriver {
    public static void main(String[] args){
        Student[] st=new Student[10];
        LabClass labClass = new LabClass();
        Random rand=new Random();
        System.out.println("Unsorted array:");
        for (int i = 0; i < 10; i++) {
            st[i] = new Student(rand.nextInt(100),rand.nextInt(100),"FullName"+i);
            System.out.print(st[i].getGrade() + " ");
        }
        labClass.sortStudent(st);
        System.out.println();
        System.out.println("Sorted array:");
        for (Student student : st)
            System.out.print(student.getGrade() + " ");
        System.out.println();
        labClass.findStudent(st, "Ksenia");
        labClass.findStudent(st, "");

    }
}
