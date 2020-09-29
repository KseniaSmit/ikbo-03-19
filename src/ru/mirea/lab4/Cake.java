package ru.mirea.lab4;

public class Cake implements Priceable{
    private double price;
    Cake(double price){
        this.price=price;
    }
    @Override
    public double getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return  "The price of cake is "+price;
    }
}
