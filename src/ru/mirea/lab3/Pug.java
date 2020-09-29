package ru.mirea.lab3;

public class Pug extends Dog{
    private double height;
    public Pug(String name, double weight, String color, double height){
        super(name, weight, color);
        this.height=height;
    }
    @Override
    public String toString(){
        return "Pug name is "+name+", his color - "+color+" and his weight - "+weight;
    }
    public double Price(){
        return height*weight;
    }
}
