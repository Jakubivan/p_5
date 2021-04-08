package sk.stuba.fei.uim.oop;

import java.awt.*;
import java.awt.event.*;


class TestKlavesnice extends Frame implements KeyListener
{   public TestKlavesnice ()
{   addKeyListener (this);
    addWindowListener(new Closer());
}
    // Metody pre KeyListener:
    public void keyPressed (KeyEvent e)
    {   System.out.println("Pressed KeyCode: "+e.getKeyCode());
        if (e.isActionKey())
            System.out.println("Som action key");
    }
    public void keyReleased (KeyEvent e)
    { System.out.println("Released KeyCode: " +e.getKeyCode());
        System.out.println("------------------------");

    }
    public void keyTyped (KeyEvent e)
    {   System.out.println("Typed KeyChar: "+e.getKeyChar());

    }
}