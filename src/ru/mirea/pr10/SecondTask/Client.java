package ru.mirea.pr10.SecondTask;

public class Client {
    public Chair chair;
    public void sit(){
        System.out.println("Client sit on "+chair);
    }
    public void setChair(Chair chair){
        this.chair=chair;
    }
}
