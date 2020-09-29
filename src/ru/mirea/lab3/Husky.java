package ru.mirea.lab3;

public class Husky extends Dog{
    private double height;
    public Husky(String name, double weight, String color, double height){
        super(name, weight, color);
        this.height=height;
    }
    @Override
    public String toString(){
        return "Husky name is "+name+", his color - "+color+" and his weight - "+weight;
    }
    public double Price(){
        return height*weight;
    }
}
