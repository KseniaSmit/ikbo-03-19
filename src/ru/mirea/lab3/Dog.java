package ru.mirea.lab3;

public abstract class Dog {
    protected String name;
    protected double weight;
    protected String color;
    public Dog(String name, double weight, String color){
        this.name=name;
        this.weight=weight;
        this.color=color;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public abstract double Price();

}

