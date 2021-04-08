package sk.stuba.fei.uim.oop;

import java.awt.event.*;

class ButtonPrinter implements ActionListener {

    int pocet = 0;
    public void actionPerformed (ActionEvent e) {
        pocet++;
        System.out.println(e.getActionCommand() + " " + pocet);
    }
}

