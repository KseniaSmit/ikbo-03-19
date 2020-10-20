package ru.mirea.pr7;

import java.util.*;
import java.util.Scanner;

public class PlayDoubleList {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<Double> pl1=new  LinkedList<>();
        LinkedList<Double> pl2=new  LinkedList<>();
        for(int i=0;i<5;i++){
            pl1.addLast(sc.nextDouble());
            pl2.addLast(sc.nextDouble());
        }
        int count=0;
        boolean res=false;
        for(int i=0;i<106;i++){

            double deck1 = pl1.pollFirst();
            double deck2 = pl2.pollFirst();
            count++;

            if (deck1 > deck2 || ((deck1 == 0) && (deck2 == 9))) {
                pl1.addLast(deck1);
                pl1.addLast(deck2);
            } else if (deck1 < deck2 || ((deck1 == 9) && (deck2 == 0))) {
                pl2.addLast(deck1);
                pl2.addLast(deck2);
            }
            pl1.pollFirst();
            pl2.pollFirst();

            if (pl1.size() == 0) {
                System.out.println("Second " + count);
                res = true;
                break;
            } else if (pl2.size() == 0) {
                System.out.println("First " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("Botva!");
    }
}
