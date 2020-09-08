package ru.mirea.lab1;
import java.util.Scanner;
public class lab1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] b=new int[10];
        int sum1=0;
        int sum2=0;
        int sum3=0;
        System.out.println("Введите массив:");
        for(int i=0;i<10;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            sum1+=b[i];
        }
        int a=0;
        while(a!=10){
            sum2+=b[a];
            a++;
        }
        int c=0;
        do{
            sum3+=b[c];
            c++;
        }while(c!=10);
        System.out.println(sum1+" "+sum2+" "+sum3);
    }
}
