package ru.mirea.aod;
import java.util.ArrayDeque;
public class Que {
    public static void main(String[] args) {

        int[] num = {170, 45, 75, 90, 802, 2, 24, 66, 23, 234, 3, 232, 44};

        radixSort(num);

        for (int h : num)
            System.out.print(h + " ");
    }

    public static void radixSort(int[] input) {

        ArrayDeque<Integer>[] buckets = new ArrayDeque[10];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayDeque<>();
        }

        // sort
        boolean flag = false;
        int tmp = -1, divisor = 1;
        while (!flag) {
            flag = true;
            // split input between lists
            for (Integer i : input) {
                tmp = i / divisor;
                buckets[tmp % 10].addLast(i);
                if (flag && tmp > 0) {
                    flag = false;
                }
            }
            // empty lists into input array
            int a = 0;
            for (int b = 0; b < 10; b++) {
                for (Integer i : buckets[b]) {
                    input[a++] = i;
                }
                buckets[b].removeFirst();
            }
            // move to next digit
            divisor *= 10;
        }
    }
}