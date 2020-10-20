package ru.mirea.lab6;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Guess extends JFrame {
    public String attempt(int k) {
        if (k == 3) return "Попытки закончились!";
        if (k == 2) return "Осталось 2 попытки!";
        if (k == 1) return "Осталась 1 попытка!";
        else return "";
    }

    private final int guessNum = (int) (1 + Math.random() * 20);
    private int k = 3;

    Guess() {
        JButton btn = new JButton("Введите число от 0 до 20:");
        JTextField txt = new JTextField(10);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 120);
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        container.add(btn);
        container.add(txt);
        btn.addActionListener(ae -> {
            if (k > 1) {
                try {
                    k--;
                    int num = Integer.parseInt(txt.getText());
                    if (num == guessNum)
                        JOptionPane.showMessageDialog(null, "Число угадано!", attempt(k), JOptionPane.INFORMATION_MESSAGE);
                    else if (num < guessNum)
                        JOptionPane.showMessageDialog(null, "Загаданное число больше!", attempt(k), JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "Загаданное число меньше!", attempt(k), JOptionPane.INFORMATION_MESSAGE);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ошибка!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null,attempt(3), "alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        setVisible(true);
    }
    public static void main(String[] args){
        new Guess();
    }

}
