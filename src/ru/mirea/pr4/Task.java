package ru.mirea.pr4;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Task extends JFrame {
    JPanel[] panel = new JPanel[3];
    private int ACMilanScore = 0;
    private int RealMadridScore = 0;


    private String getWinner(int MilanScore, int MadridScore) {
        if (MilanScore > MadridScore) return "AC Milan";
        if (MilanScore < MadridScore) return "Real Madrid";
        return "Ничья";
    }

    public Task() {

        setLayout(new GridLayout(1, 3));

        for (int i = 0; i < panel.length; i++) {
            panel[i] = new JPanel();
            panel[i].setLayout(new BorderLayout());
            add(panel[i]);
        }

        JButton btn1 = new JButton("AC Milan");
        JButton btn2 = new JButton("Real Madrid");
        btn1.setBorder(new EmptyBorder(5, 5, 5, 5));
        btn2.setBorder(new EmptyBorder(5, 5, 5, 5));

        JLabel label1 = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
        JLabel label2 = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        JLabel label3 = new JLabel("Winner: DRAW", SwingConstants.CENTER);
        label1.setBorder(new EmptyBorder(10, 5, 5, 5));
        label2.setBorder(new EmptyBorder(5, 5, 5, 5));
        label3.setBorder(new EmptyBorder(5, 5, 10, 5));

        btn1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ACMilanScore++;
                label1.setText("Result: " + ACMilanScore + " X " + RealMadridScore);
                label2.setText("Last Scorer: AC Milan");
                label3.setText("Winner: " + getWinner(ACMilanScore, RealMadridScore));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        btn2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                RealMadridScore++;
                label1.setText("Result: " + ACMilanScore + " X " + RealMadridScore);
                label2.setText("Last Scorer: Real Madrid");
                label3.setText("Winner: " + getWinner(ACMilanScore, RealMadridScore));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        panel[0].add(btn1, BorderLayout.CENTER);
        panel[2].add(btn2, BorderLayout.CENTER);

        panel[1].add(label1, BorderLayout.SOUTH);
        panel[1].add(label2, BorderLayout.NORTH);
        panel[1].add(label3, BorderLayout.CENTER);
        setSize(700, 300);
    }

    public static void main(String[] args) {
        new Task().setVisible(true);
    }
}
