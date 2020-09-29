package ru.mirea.lab4;

public class Chocolate implements Priceable {
    private double price;
    Chocolate(double price){
        this.price=price;
    }
    @Override
    public double getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return  "The price of chocolate is "+price;
    }
}
