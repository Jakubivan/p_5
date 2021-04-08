package sk.stuba.fei.uim.oop;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyButton extends JButton implements ActionListener {
    int pocet;
    public MyButton(String label)
    {	super (label);
        pocet = 0;
        addActionListener(this); // Registruje MyButton ako Event-Listener.
    }
    public void actionPerformed (ActionEvent e)
    {
        pocet++;
        System.out.println(e.getActionCommand() + " " + pocet);
    }
}
