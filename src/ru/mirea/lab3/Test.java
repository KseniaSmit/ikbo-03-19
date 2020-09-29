package ru.mirea.lab3;

public class Test {
    public static void main(String[] args){
        Dog d1=new Husky("Ru", 20.8,"White",120.5);
        Dog d2=new Pug("Bu", 5.2,"brown", 30.5);
        Dog d3=new Terrier("Vu", 8.3,"black", 50.4);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d2.Price());
    }
}
