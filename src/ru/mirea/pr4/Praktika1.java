package ru.mirea.pr4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Praktika1 extends JFrame {
    JPanel[] pnl=new JPanel[3];
    private int MilanScore=0;
    private int MadridScore=0;
    private String getWin(int MilanScore, int MadridScore){
        if (MilanScore>MadridScore) return "AC Milan";
        if (MilanScore<MadridScore) return "Real Madrid";
        return "Draw";
    }
    public Praktika1(){
        setLayout(new GridLayout(3,1));
        for(int i=0; i<pnl.length;i++){
            int r=(int) (Math.random()*255);
            int g=(int) (Math.random()*255);
            int b=(int) (Math.random()*255);
            pnl[i]=new JPanel();
            pnl[i].setLayout(new BorderLayout());
            pnl[i].setBackground(new Color(r, g, b));
            add(pnl[i]);
        }

        JButton but1=new JButton("AC MILAN");
        JButton but2=new JButton("REAL MADRID");
        JLabel lab1=new JLabel("Result:0 X 0", SwingConstants.CENTER);
        JLabel lab2=new JLabel("Last Scorer:N/A", SwingConstants.CENTER);
        JLabel lab3=new JLabel("Winner:DRAW", SwingConstants.CENTER);
        but1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MilanScore++;
                lab1.setText("Result:"+MilanScore+" X "+MadridScore);
                lab2.setText("Last Scorer: AC MILAN");
                lab3.setText("Winner:"+getWin(MilanScore, MadridScore));
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
        but2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MadridScore++;
                lab1.setText("Result:"+MilanScore+" X "+MadridScore);
                lab2.setText("Last Scorer: REAL MADRID");
                lab3.setText("Winner:"+getWin(MilanScore, MadridScore));
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
        pnl[0].add(but1, BorderLayout.CENTER);
        pnl[2].add(but2, BorderLayout.CENTER);
        pnl[1].add(lab1, BorderLayout.SOUTH);
        pnl[1].add(lab2, BorderLayout.NORTH);
        pnl[1].add(lab3, BorderLayout.CENTER);
        setSize(500,300);
    }
    public static void main(String[] args){
        new Praktika1().setVisible(true);
    }
}
