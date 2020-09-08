package ru.mirea.lab1;
import java.util.Scanner;
public class lab5 {
    public static int getFact(int a){
        int res=1;
        for(int i=1;i<=a;i++){
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число:");
        int a=sc.nextInt();
        System.out.println("Факториал равен:");
        System.out.println(getFact(a));
    }
}
