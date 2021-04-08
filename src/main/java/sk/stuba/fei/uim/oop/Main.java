package sk.stuba.fei.uim.oop;
import javax.swing.*;


public class Main{

    public static void main (String args[]) {
        JFrame F=new JFrame();
        F.setSize(300,300);
        JPanel P=new JPanel(); // JPanel pre JButton
        JButton B=new JButton("OK");
        B.addActionListener(new ButtonPrinter()); // Registracia objektu
        // ButtonPrinter ako Event-Listener.
        P.add(B); // JButton na JPanel
        F.add(P); // JPanel na JFrame
        F.setVisible(true);
    }
}
