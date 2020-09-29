package ru.mirea.pr3;

public class Tests {
    public static void main(String[] args){
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // Вызываем метод из класса Circle
        System.out.println(s1.getArea()); // Вызываем метод из класса Circle
        System.out.println(s1.getPerimeter()); // Вызываем метод из класса Circle
        System.out.println(s1.getColor()); // Вызываем метод из класса Shape
        System.out.println(s1.isFilled()); // Вызываем метод из класса Shape
        //System.out.println(s1.getRadius()); // ошибка, метода нет в классе Shape

        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1); // Вызываем метод из класса Circle
        System.out.println(c1.getArea()); // Вызываем метод из класса Circle
        System.out.println(c1.getPerimeter()); // Вызываем метод из класса Circle
        System.out.println(c1.getColor()); // Вызываем метод из класса Shape
        System.out.println(c1.isFilled()); // Вызываем метод из класса Shape
        System.out.println(c1.getRadius()); // Вызываем метод из класса Circle

        //Shape s2 = new Shape(); //  Ошибка, т.к. объект абстрактного класса создать нельзя

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3); // Вызываем метод из класса Rectangle
        System.out.println(s3.getArea()); // Вызываем метод из класса Rectangle
        System.out.println(s3.getPerimeter()); // Вызываем метод из класса Rectangle
        System.out.println(s3.getColor()); // Вызываем метод из класса Shape
        //System.out.println(s3.getLength()); // ошибка, метода нет в классе Shape

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1); // Вызываем метод из класса Rectangle
        System.out.println(r1.getArea()); // Вызываем метод из класса Rectangle
        System.out.println(r1.getColor()); // Вызываем метод из класса Shape
        System.out.println(r1.getLength()); // Вызываем метод из класса Rectangle

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4); // Вызываем метод из класса Square
        System.out.println(s4.getArea()); // Вызываем метод из класса Square
        System.out.println(s4.getColor()); // Вызываем метод из класса Shape
        //System.out.println(s4.getSide()); // ошибка, метода нет в классе Shape

        Rectangle r2 = (Rectangle)s4; // downcast
        System.out.println(r2); // Вызываем метод из класса Square
        System.out.println(r2.getArea()); // Вызываем метод из класса Rectangle
        System.out.println(r2.getColor()); // Вызываем метод из класса Shape
        //System.out.println(r2.getSide());  // ошибка, метода нет в классе Rectangle
        System.out.println(r2.getLength()); // Вызываем метод из класса Rectangle

        Square sq1 = (Square)r2; // Downcast Rectangle r2 to Square
        System.out.println(sq1); // Вызываем метод из класса Square
        System.out.println(sq1.getArea()); // Вызываем метод из класса Rectangle
        System.out.println(sq1.getColor()); // Вызываем метод из класса Shape
        System.out.println(sq1.getSide()); // Вызываем метод из класса Square
        System.out.println(sq1.getLength()); // Вызываем метод из класса Rectangle
    }
}
