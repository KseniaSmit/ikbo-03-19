package ru.mirea.pr10.FirstTask;

public class TestComplex {
    public static void main(String[] args){
        Complex com1=new Complex(4, 5);
        Complex com2=new Complex(10, 13);
        com2.setImage(24);
        System.out.println(com1);
        System.out.println(com2);
        System.out.println(com1.getReal());
    }

}
