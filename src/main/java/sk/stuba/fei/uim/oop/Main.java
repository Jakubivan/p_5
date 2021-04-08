package sk.stuba.fei.uim.oop;
import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main (String args[]) {
        JFrame F=new JFrame();
        F.setLayout(new GridLayout(0,2));
        F.add(new JLabel("Riadok 1, Stlpec 1 "));
        F.add(new JLabel("Riadok 1, Stlpec 2"));
        F.add(new JLabel("Riadok 2, Stlpec 1 "));
        F.add(new JLabel("Riadok 2, Stlpec 2"));
        // Anzeigen:
        F.pack();
        F.setVisible(true);
    }
}