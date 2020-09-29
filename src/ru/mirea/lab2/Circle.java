package ru.mirea.lab2;

public class Circle {
    private double radius;
    private String name;
    public Circle(double r, String n){
        radius=r;
        name=n;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public String getName(){
        return name;
    }
    public double getRadius(){
        return radius;
    }
    public void getLength(){
        System.out.printf("%.3f", 2*radius*Math.PI);
    }
    public String toString(){
        return "radius of "+this.name+" is "+this.radius;
    }
}
