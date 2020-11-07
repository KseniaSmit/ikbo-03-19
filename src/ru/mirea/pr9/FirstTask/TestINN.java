package ru.mirea.pr9.FirstTask;

public class TestINN {
    public static boolean check(Customer customer, int INN) {
        try {
            if (customer.getINN() == INN) return true;
            else throw new BadINNException("INN is wrong");
        } catch (BadINNException e) {
            System.err.println(e);
        }
        return false;
    }
    public static void main(String[] args){
        Customer customer = new Customer("Ksenia", 123456);
        check(customer, 12345);
    }
}
