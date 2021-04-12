package sk.stuba.fei.uim.oop;


import java.awt.*;

public class Main{

    public static void main (String args[])
    {
        TestFrame f=new TestFrame();
        ScrollPane ms = new ScrollPane();
        MyCanvas papier = new MyCanvas();
        papier.setSize(500,500);
        ms.add(papier);
        f.add(ms);
        f.setSize(300,300);
        f.setVisible(true);
    }
}