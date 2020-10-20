package ru.mirea.lab8;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class Task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        writeUsingFileWriter(in.nextLine());
    }
    private static void writeUsingFileWriter(String data) {
        File file = new File("C:\\Users\\Xiaomi\\IdeaProjects\\lab1\\src\\ru\\mirea\\lab8\\notes3.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
