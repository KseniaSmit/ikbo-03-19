package ru.mirea.pr9.FirstTask;

public class Customer {
    private String name;
    private int INN;
    public Customer(String name, int INN){
        this.name=name;
        this.INN=INN;
    }
    public String getName(){
        return name;
    }
    public int getINN(){
        return INN;
    }
}
