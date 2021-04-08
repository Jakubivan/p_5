package sk.stuba.fei.uim.oop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class TestFrame extends JFrame implements ActionListener
{
    String Close="Close";

    public TestFrame ()
    {
        super("Test Frame");
        setSize(300,300);
        JPanel P = new JPanel(); // Panel pre Button
        JButton B = new JButton(Close);
        B.addActionListener(this); // Sam Event-Listener
        P.add(B); // Button na Panel
        add(P); // Panel na Okno
        setVisible(true);
        addWindowListener(new Closer());
    }
    public void actionPerformed (ActionEvent e)
    {
        if (e.getActionCommand().equals(Close))
        {
            dispose(); System.exit(0);
        }
    }
}