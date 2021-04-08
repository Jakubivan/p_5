package sk.stuba.fei.uim.oop;
import javax.swing.*;


public class Main{

    public static void main (String args[]) {
        JFrame F=new JFrame("Test udalosti");
        F.setSize(300,300);
        JPanel P = new JPanel();
        MyButton B = new MyButton("OK");
        JButton iny = new JButton("aby si skapal ty ActionListener");
        iny.addActionListener(B);
        P.add(B);
        P.add(iny);
        F.add(P);
        F.setVisible(true);
    }
}
