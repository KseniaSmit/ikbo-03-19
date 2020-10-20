package ru.mirea.pr7;
import java.util.*;
import java.util.Scanner;
public class PlayStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pl1 = new Stack<>();
        Stack<Integer> pl2 = new Stack<>();
        for (int i = 0; i < 5; i++) {
            pl1.push(sc.nextInt());
            pl2.push(sc.nextInt());
        }
        int part = 0;
        while (!pl1.isEmpty() && !pl2.isEmpty() && part < 107) {
            int deck1 = pl1.pop();
            int deck2 = pl2.pop();

            if (deck1 == 0 && deck2 == 9) {
                pl1.add(0,deck1);
                pl1.add(0, deck2);
            } else if (deck1 == 9 && deck2 == 0) {
                pl2.add(0, deck1);
                pl2.add(0, deck2);
            } else if (deck1 > deck2) {
                pl1.add(0, deck1);
                pl1.add(0, deck2);
            } else {
                pl2.add(0, deck1);
                pl2.add(0, deck2);
            }
            part++;
        }

        if (part == 107) {
            System.out.println("Botva");
        } else if (pl2.isEmpty()) {
            System.out.println("first " + part);
        } else {
            System.out.println("second " + part);
        }
    }


}
