package ru.mirea.aod;
import java.util.ArrayDeque;
import java.util.Scanner;
public class ExampleRadixSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int mas[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            mas[i] = input.nextInt();
        }
        radixSort(mas);
        System.out.println("After:");
        for (int h : mas)
            System.out.print(h + " ");
    }

    public static void radixSort(int[] in) {

        ArrayDeque<Integer>[] radix = new ArrayDeque[10];
        for (int i = 0; i < radix.length; i++) {
            radix[i] = new ArrayDeque<Integer>();
        }

        // sort
        boolean flag = false;
        int tmp = -1, divisor = 1;
        while (!flag) {
            flag = true;
            for (Integer i : in) {
                tmp = i / divisor;
                radix[tmp % 10].addLast(i);
                if (tmp > 0) {
                    flag = false;
                }
            }
            int a = 0;
            for (int b = 0; b < 10; b++) {
                for (Integer i : radix[b]) {
                    in[a++] = i;
                }
                radix[b].clear();
            }
            divisor *= 10;
        }
    }
}
