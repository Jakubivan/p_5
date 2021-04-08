package sk.stuba.fei.uim.oop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class TestFrame extends JFrame implements ItemListener

{   JCheckBox one;
    JCheckBox two;
    JTextField In;

    public TestFrame ()
    {   super("Test");
        setLayout(new BorderLayout());
        setSize(500,400);

        add("North", one = new JCheckBox("one", true)); one.addItemListener(this);

        add("Center", two = new JCheckBox("two")); two.addItemListener(this);

        add("South",In = new JTextField());

        In.setText("One is " + one.isSelected() + " and two is " + two.isSelected());

        pack();

        setVisible(true);

    }



    public void itemStateChanged (ItemEvent e)
    {   if ((e.getSource()==one)||(e.getSource()==two))
    {
        In.setText("One is " + one.isSelected() + " and two is " + two.isSelected());
    }
    /*else if (e.getSource()==two)
    {
        In.setText("Two is " + two.isSelected() + " and one is " + one.isSelected());
    }*/
    }
}