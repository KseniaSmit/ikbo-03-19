package ru.mirea.pr10.SecondTask;

public class VictorianChair implements Chair {
    private int age;
    public VictorianChair(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return "Victorian chair with age="+age;
    }
}
