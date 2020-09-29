package ru.mirea.lab2;

public class TestCircle {
    public static void main(String[] args){
        Circle sc1=new Circle(5.7,"Ci");
        Circle sc2=new Circle(10, "Bi");
        sc2.setRadius(12);
        System.out.println(sc1);
        System.out.println(sc2);
        sc1.getLength();
        System.out.println();
        sc2.getLength();
    }
}
