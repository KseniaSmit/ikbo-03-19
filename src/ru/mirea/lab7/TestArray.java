package ru.mirea.lab7;
import java.util.ArrayList;
public class TestArray {
    public static void main(String[] args){
        ArrayList<String> towns = new ArrayList<String>();
        // добавим в список ряд элементов
        towns.add("Москва");
        towns.add("Санкт-Петербург");
        towns.add("Архангельск");
        towns.add("Ярославль");
        towns.add(1, "Брянск");

        System.out.println(towns.get(1));
        towns.set(1, "Кострома");

        System.out.printf("В списке %d элементов \n", towns.size());
        for(String town : towns){

            System.out.println(town);
        }

        if(towns.contains("Москва")){

            System.out.println("Список содержит город Москва");
        }
        towns.remove("Москва");
        towns.remove(0);

        Object[] countries = towns.toArray();
        for(Object town : towns){

            System.out.println(town);
        }
    }
}
