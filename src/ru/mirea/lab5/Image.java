package ru.mirea.lab5;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class Image extends JPanel {
    String scr = "C:\\Users\\Xiaomi\\IdeaProjects\\lab1\\src\\ru\\mirea\\lab5\\flow.jpg";
    JFrame jfr= new JFrame("Вывод картинки");
    JPanel jpn=new JPanel(new BorderLayout());
    WorkPanel wpn=new WorkPanel();
    JOptionPane jop=new JOptionPane();
    BufferedImage bufImg=null;

    public Image(String filepath){
        jfr.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jfr.setVisible(true);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfr.add(jpn, BorderLayout.WEST);
        jfr.add(wpn, BorderLayout.CENTER);
        jpn.setSize(200, 200);
        try {
            File file=new File(filepath);
            bufImg=ImageIO.read(file);
            wpn.setImage(bufImg);
            wpn.repaint();
        }catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(jop, "File not found");
        }catch (IOException ex){
            JOptionPane.showMessageDialog(jop, "Incorrect input-output");
        }

    }
    public static void main(String[] args){
        new Image(args[0]);
    }
    }