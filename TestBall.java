package ru.mirea.pr1;

public class TestBall {
    public static void main(String[] args){
        ball ba=new ball("Blue", 450);
        ball ba2=new ball("Red", 1000);
        ba2.setColor("Green");
        System.out.println(ba2);
        ba.Price();
        ba2.Price();
    }
}
