package ru.mirea.pr2;
public class TestAuthor {
    public static void main(String[] args){
        Author a1=new Author("Ivanova", "II@MAIL.RU", 'F');
        Author a2=new Author("Zvezdnaya", "ZVEZDA@MAIL.RU", 'U');
        a1.setEmail("Ivan@mail.ru");
        System.out.println(a2);
        System.out.println(a1);
    }
}
