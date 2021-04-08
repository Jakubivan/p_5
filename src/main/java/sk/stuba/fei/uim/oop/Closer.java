package sk.stuba.fei.uim.oop;


import java.awt.event.*;

class Closer extends WindowAdapter

{   public void windowClosing (WindowEvent e)
{
    System.exit(0);
}
}