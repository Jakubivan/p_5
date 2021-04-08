package sk.stuba.fei.uim.oop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TestFrame extends JFrame implements ActionListener
{	String Close="Zavri2";
    JButton B; // tu je pridany atribut

    public TestFrame ()
    {	super("Test Frame");
        setSize(300,300);

        JPanel P = new JPanel(); // Panel pre Button
        B = new JButton(Close); // tu pouzijeme pridany atribut
        B.addActionListener(this); // Sam je Event-Listener
        P.add(B); // Button na Panel
        add(P); // Panel do Okna
        setVisible(true);
    }

    public void actionPerformed (ActionEvent e)
    {	if (e.getSource() == B) // tu je zmena
    {	dispose(); System.exit(0); // zavrie okno a ukonci program
    }
    }
}