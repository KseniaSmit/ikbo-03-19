package ru.mirea.lab4;

public class Maffin implements Priceable {
    private double price;
    Maffin(double price){
        this.price=price;
    }
    @Override
    public double getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return  "The price of maffin is "+price;
    }
}
