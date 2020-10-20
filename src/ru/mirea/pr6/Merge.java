package ru.mirea.pr6;
import java.util.Random;
import java.util.Arrays;
public class Merge {
    public static Student[] concatenate(Student std1[], Student std2[]){
        Student std3[]=new Student[std1.length+std2.length];
        int a=0, b=0;
        for(int i=0;i<std3.length;i++){
            if (a>std1.length-1){
                Student std=std2[b];
                std3[i]=std;
                b++;
            }
            else if (b>std2.length-1){
                Student std=std1[a];
                std3[i]=std;
                a++;
            }
            else if (std1[a].getGrade()<std2[b].getGrade()){
                Student std=std1[a];
                std3[i]=std;
                a++;
            }
            else{
                Student std0=std2[b];
                std3[i]=std0;
                b++;
            }
        }
        return std3;
    }
    public static void main(String[] args){
        Student[] students1=new Student[5];
        Student[] students2=new Student[5];
        Random rand=new Random();
        for (int i = 0; i < 5; i++) {
            students1[i] = new Student(rand.nextInt(100),rand.nextInt(100));
            System.out.print(students1[i].getGrade() + " ");
        }
        System.out.println();
        for (int j = 0; j < 5; j++) {
            students2[j] = new Student(rand.nextInt(100),rand.nextInt(100));
            System.out.print(students2[j].getGrade() + " ");
        }
        System.out.println();
        Arrays.sort(students1, new SortingStudentsByGPA());
        Arrays.sort(students2, new SortingStudentsByGPA());
        Student[] sortedArray = concatenate(students1, students2);
        for (Student student : sortedArray)
            System.out.print(student.getGrade() + " ");

    }
}
