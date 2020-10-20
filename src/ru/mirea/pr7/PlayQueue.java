package ru.mirea.pr7;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PlayQueue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Integer> pl1=new LinkedList<>();
        Queue<Integer> pl2=new  LinkedList<>();
        for(int i=0;i<5;i++){
            pl1.offer(sc.nextInt());
            pl2.offer(sc.nextInt());
        }
        int count=0;
        boolean res=false;
        for(int i=0;i<106;i++){

            int deck1 = pl1.poll();
            int deck2 = pl2.poll();
            count++;

            if (deck1 > deck2 || ((deck1 == 0) && (deck2 == 9))) {
                pl1.offer(deck1);
                pl1.offer(deck2);
            } else if (deck1 < deck2 || ((deck1 == 9) && (deck2 == 0))) {
                pl2.offer(deck1);
                pl2.offer(deck2);
            }
            pl1.poll();
            pl2.poll();

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
