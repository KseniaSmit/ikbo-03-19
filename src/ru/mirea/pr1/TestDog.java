package ru.mirea.pr1;

public class TestDog {
    public static void main(String[] args){
        dog dg1=new dog("Mike", 16);
        dog dg2=new dog("Rich", 72);
        dg1.setHeight(51);
        System.out.println(dg1);
        System.out.println(dg1.getName()+" is "+dg1.size());
        System.out.println(dg2.getName()+" is "+dg2.size());
    }
}
