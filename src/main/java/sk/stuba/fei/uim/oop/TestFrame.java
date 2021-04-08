package sk.stuba.fei.uim.oop;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class TestFrame extends JFrame implements ItemListener
{	List zoznam;
    Choice rozbalovacie_volby;
    String polozky_pre_zoznam[]={"Jablko","Hruska","Ceresna", "Melon", "Ananas"};
    String polozky_pre_rozbalovacie[]={"Jablko","Hruska","Ceresna", "Melon", "Ananasik"};


    public TestFrame ()
    {
        super("Test Choicu a Listu");
        setLayout(new BorderLayout());
        setSize(500,400);

        rozbalovacie_volby=new Choice();
        rozbalovacie_volby.addItemListener(this);

        zoznam=new List();
        zoznam.addItemListener(this);

        for (int i=0; i<polozky_pre_zoznam.length; i++)
        {
            //rozbalovacie_volby.add(polozky[i]);
            zoznam.add(polozky_pre_zoznam[i]);
        }

        for (int i=0; i<polozky_pre_rozbalovacie.length; i++)
        {
            rozbalovacie_volby.add(polozky_pre_rozbalovacie[i]);
            //zoznam.add(polozky_pre_rozbalovacie[i]);
        }

        add("Center",zoznam);
        add("South",rozbalovacie_volby);
        setVisible(true);
    }

    public void itemStateChanged (ItemEvent e)
    {	if (e.getSource()==rozbalovacie_volby)
    {	zoznam.select(rozbalovacie_volby.getSelectedIndex());
    }
    else if (e.getSource()==zoznam)
    {	rozbalovacie_volby.select(zoznam.getSelectedIndex());
    }
    }
}
