package sk.stuba.fei.uim.oop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TestFrame extends JFrame implements ActionListener
{	String Close="Zavri";
    String Novinka = "New"; // tu pridame novy atribut

    public TestFrame ()
    {	super("Test Frame");
        setSize(300,300);

        JPanel P = new JPanel(); // Panel for Button
        JButton B = new JButton(Close);
        JButton novy = new JButton(Novinka); // tu pridame novy button
        B.addActionListener(this); // Sam sebe Event-Listener
        novy.addActionListener(this);
        P.add(B); // Button na Panel
        P.add(novy); // Button na Panel
        add(P); // Panel na Fenster
        setVisible(true);
    }

    public void actionPerformed (ActionEvent e)
    {	if (e.getActionCommand().equals(Close))
    {	dispose(); System.exit(0); // Zavrie okno a ukonci program
    }
        if (e.getActionCommand().equals(Novinka))
        {	new TestFrame(); // nove okno
        }
    }
}