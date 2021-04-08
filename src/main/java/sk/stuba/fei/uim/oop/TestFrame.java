package sk.stuba.fei.uim.oop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class TestFrame extends JFrame
        implements ItemListener
{   JRadioButton one;
    JRadioButton two;
    ButtonGroup bg = new ButtonGroup();
    JTextField In;

    public TestFrame ()
    {   super("Test");
        setLayout(new BorderLayout());
        setSize(500,400);

        one = new JRadioButton("one");
        add("North",one);
        one.addItemListener(this);
        bg.add(one);

        two = new JRadioButton("two", true);
        add("Center", two);
        two.addItemListener(this);
        bg.add(two);
        add("South",In = new JTextField());
        In.setText("One is " + one.isSelected() + " and two is " + two.isSelected());
        pack();
        setVisible(true);
    }

    public void itemStateChanged (ItemEvent e)
    {   if (e.getSource()==one)
    {   In.setText("One is " + one.isSelected() + " and two is " + two.isSelected());
    }
    else if (e.getSource()==two)
    {   In.setText("Two is " + two.isSelected() + " and one is " + one.isSelected());
    }
    }
}