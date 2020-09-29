package ru.mirea.pr1;

public class TestBook {
    public static void main(String[] args){
        book bk=new book("Pushkin", 500);
        book bk2=new book("Lermontov", 250);
        bk2.setName("Dostoevckiy");
        System.out.println(bk2);
        bk.weight();
        bk2.weight();
    }
}
