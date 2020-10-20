package ru.mirea.pr6;
import java.util.Random;
public class TestStudent {
    public static void insertionSort(int[] array){
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }
    public static void main(String[] args){
        Random rand=new Random();
        Student[] students=new Student[10];
        int[] IDNumber=new int[10];
        for (int i = 0; i < 10; i++) {
            students[i] = new Student(rand.nextInt(100),rand.nextInt(100));
            IDNumber[i] = students[i].getId();
            System.out.print(IDNumber[i] + " ");
        }
        System.out.println("\nSorted array:");
        insertionSort(IDNumber);
        for (int id : IDNumber) {
            System.out.print(id + " ");
        }
    }

}
