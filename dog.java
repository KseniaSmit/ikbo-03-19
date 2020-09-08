package ru.mirea.pr1;

public class dog {
    private String name;
    private double height;
    public dog(String n, double h){
        name=n;
        height=h;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public String getName(){
        return name;
    }
    public double getHeight(){
        return height;
    }
    public String toString(){
        return this.name+", height is "+this.height;
    }
    public String size (){
        String s;
        if (height<28)
           return s="little";
        else if(height>28 && height<60)
            return s="medium";
        else
            return s="big";
    }
}
