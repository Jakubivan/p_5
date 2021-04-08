package sk.stuba.fei.uim.oop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class TestFrame extends JFrame implements ActionListener
{	String Close="Zavri";
    String Novinka = "New"; // tu pridame novy atribut
    public static int pocetframeov = 0; // tu pridame pocitadlo
    public static int umiestnenie = 10;
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
        setLocation(umiestnenie, umiestnenie); // tu nastavime umiestnenie okna
        setVisible(true);
        pocetframeov++; // tu zvysime pocet okien
        umiestnenie = umiestnenie + 50; // tu posunieme umiestnenie pre dalsie okno
    }

    public void actionPerformed (ActionEvent e)
    {	if (e.getActionCommand().equals(Close))
    {	if (pocetframeov == 1)System.exit(0); // tu ak je okno iba jedno ukonci program
    else {dispose();
        pocetframeov--;}	// Zavrie okno
    }
        if (e.getActionCommand().equals(Novinka))
        {	new TestFrame(); // nove okno
        }
    }
}