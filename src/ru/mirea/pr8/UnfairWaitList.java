package ru.mirea.pr8;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        super();
    }
    public E remove(){
        return super.remove();
    }
    public void moveToBack(E element){
        super.add(element);
    }
}
