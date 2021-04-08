package sk.stuba.fei.uim.oop;
import javax.swing.*;


public class Main{

    public static void main (String args[])
    {   JFrame f = new JFrame();
        f.add(new TestCanvas());
        f.setSize(300,300);
        f.setVisible(true);
    }
}