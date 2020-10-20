package ru.mirea.pr7;
import java.util.ArrayDeque;
import java.util.Scanner;
public class PlayDequeue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayDeque<Integer> pl1=new  ArrayDeque<>(10);
        ArrayDeque<Integer> pl2=new  ArrayDeque<>(10);
        for(int i=0;i<5;i++){
            pl1.addLast(sc.nextInt());
            pl2.addLast(sc.nextInt());
        }
        int count=0;
        boolean res=false;
        for(int i=0;i<106;i++){

            int deck1 = pl1.pollFirst();
            int deck2 = pl2.pollFirst();
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
