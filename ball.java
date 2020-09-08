package ru.mirea.pr1;
public class ball {
    private String color;
    private double weight;
    public ball(String c, double w){
        color=c;
        weight=w;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public String getColor(){
        return color;
    }
    public double getWeight(){
        return weight;
    }
    public String toString(){
        return this.color+", weight "+this.weight;
    }
    public void Price(){
        System.out.println("price of this ball is "+weight*3);
    }
}
