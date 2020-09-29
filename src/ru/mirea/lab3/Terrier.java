package ru.mirea.lab3;

public class Terrier extends Dog {
    private double height;
    public Terrier(String name, double weight, String color, double height){
        super(name, weight, color);
        this.height=height;
    }
    @Override
    public String toString(){
        return "Terrier name is "+name+", his color - "+color+" and his weight - "+weight;
    }
    public double Price(){
        return height*weight;
    }
}
