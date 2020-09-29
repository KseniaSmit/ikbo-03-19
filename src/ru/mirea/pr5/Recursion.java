package ru.mirea.pr5;
import java.util.Scanner;
public class Recursion {
    public static int rec5(int s){
        if (s < 10) {return s;}
        else{
        return s % 10 + rec5(s / 10);}
    }
    public static String rec6(int s, int i){
        if (s==2) return "YES";
        if (s % i==0) return "NO";
        if (i < s) return rec6(s, i+1);
        else return "YES";
    }
    public static void rec7(int s, int k){
        if (s/2<k) {
            System.out.println(s);
            return;
        }
        if (s % k==0){
            System.out.println(s);
            rec7(s/k,k);
        }
        else
            rec7(s,k++);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для поиска суммы его цифр:");
        System.out.println(rec5(scanner.nextInt()));
        System.out.println("Введите число, чтобы определить простое оно или нет:");
        System.out.println(rec6(scanner.nextInt(), 2));
        System.out.println("Введите число, чтобы определить его множители:");
        rec7(scanner.nextInt(), 2);
    }
}
