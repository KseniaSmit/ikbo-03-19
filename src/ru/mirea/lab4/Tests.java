package ru.mirea.lab4;

public class Tests {
    public static void main(String[] args) {
        Priceable c1 = new Cake(589.99);
        Priceable c2 = new Chocolate(92.80);
        Priceable c3 = new Maffin(15.65);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c2.getPrice());
    }
}
