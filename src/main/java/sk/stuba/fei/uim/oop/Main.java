package sk.stuba.fei.uim.oop;
import javax.swing.*;


public class Main{

    public static void main (String args[]) {
        JFrame F=new JFrame();
        F.setSize(300,300);
        JPanel P = new JPanel();
        MyButton B = new MyButton("OK");
        P.add(B);
        F.add(P);
        F.setVisible(true);
    }
}
