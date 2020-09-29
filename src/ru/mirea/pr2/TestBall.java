package ru.mirea.pr2;
public class TestBall {
    public static void main(String[] args){
        Ball ba=new Ball(30,45);
        Ball ba2=new Ball(120,0);
        ba2.move(30,50);
        System.out.println(ba);
        System.out.println(ba2);
    }
}
