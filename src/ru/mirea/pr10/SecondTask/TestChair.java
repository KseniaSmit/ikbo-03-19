package ru.mirea.pr10.SecondTask;

public class TestChair {
    public static void main(String[] args){
        Client cl = new Client();

        cl.setChair(new ChairFactory().createVictorianChair());
        cl.sit();

        cl.setChair(new ChairFactory().createFunctionalChair());
        cl.sit();



    }
}
