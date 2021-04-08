package sk.stuba.fei.uim.oop;
import javax.swing.*;
import java.awt.*;

public class Main{

    public static void main (String args[]) {
        JFrame F = new JFrame();
        F.setSize(300,300);
        F.add("Center",new TestCanvas());
        F.setVisible(true);
        }
}
