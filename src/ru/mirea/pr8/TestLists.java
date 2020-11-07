package ru.mirea.pr8;
import java.util.Random;
public class TestLists {
    public static void main(String[] args){
        Random rand=new Random();
        System.out.println("Test of WaitList:");
        WaitList<Integer> list1 = new WaitList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(rand.nextInt(100));
        }
        System.out.println(list1.isEmpty());
        System.out.println(list1);
        list1.remove();
        System.out.println(list1);
        System.out.println("Test of BoundedWaitList:");
        WaitList<Integer> list2 = new BoundedWaitList<>(10);
        for (int i = 0; i < 10; i++) {
            list2.add(rand.nextInt(100));
        }
        System.out.println(list2.isEmpty());
        System.out.println(list2);
        list2.remove();
        System.out.println(list2);
        System.out.println("Test of UnfairWaitList:");
        WaitList<Integer> list3 = new BoundedWaitList<>(10);
        for (int i = 0; i < 10; i++) {
            list3.add(rand.nextInt(100));
        }
        System.out.println(list3.isEmpty());
        System.out.println(list3);
        list3.remove();
        System.out.println(list3);
    }
}
