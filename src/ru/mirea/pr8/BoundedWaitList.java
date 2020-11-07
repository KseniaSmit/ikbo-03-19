package ru.mirea.pr8;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;
    public BoundedWaitList(int capacity){
        this.capacity=capacity;
    }
    public int getCapacity(){
        return capacity;
    }
    public void add(E element){
        super.add(element);
    }
    public String toString(){
        return "Content of the BoundedWaitList is "+ content;
    }
}
