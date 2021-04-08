package sk.stuba.fei.uim.oop;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main (String args[])
    {
        JFrame F=new JFrame();
        F.setSize(300,300);
        F.setVisible(true);
        Graphics g=F.getGraphics();
        g.drawString("Hello World!",100,200);
    }
}
