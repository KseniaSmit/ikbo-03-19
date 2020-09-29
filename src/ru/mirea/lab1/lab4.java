package ru.mirea.lab1;

public class lab4 {
    public static void main(String[] args) {
        int[] b=new int[10];
        for (int i = 0; i<10; i++) {
            b[i]=(int) (Math.random()*100);
            System.out.print(b[i]+" ");
        }
        for(int i=9;i>0;i--){
            for(int j=0;j<i;j++){
                if(b[j]>b[j+1]){
                    int t=b[j];
                    b[j]=b[j+1];
                    b[j+1]=t;
                }
            }
        }
        System.out.println();
        for (int i = 0; i<10; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
