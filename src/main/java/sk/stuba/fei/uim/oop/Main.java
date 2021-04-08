package sk.stuba.fei.uim.oop;
import javax.swing.*;
import java.awt.*;

public class Main{

    public static void main (String args[]) {
        JFrame F=new JFrame();
        F.setSize(300,300);
        F.setLayout(new BorderLayout());
        F.add("North",new JLabel("Priklad s farbami"));
        F.add("Center",new TestCanvas());
        JPanel p=new JPanel();

        p.add(new JButton("Change"));
        p.add(new JButton("Close"));
        F.add("South",p);
        F.setVisible(true);
    }
}