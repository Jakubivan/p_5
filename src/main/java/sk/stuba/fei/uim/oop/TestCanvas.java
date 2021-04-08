package sk.stuba.fei.uim.oop;
import java.awt.*;
//import javax.swing.*;
//import java.util.*;
import java.awt.event.*;


class TestCanvas extends Canvas implements KeyListener
{   public TestCanvas ()
{   addKeyListener (this);
}
    // Metody pre KeyListener:
    public void keyPressed (KeyEvent e)
    {   if (e.isActionKey())
        System.out.println("keyPressed zavolane - Action-Key : "+e.getKeyCode());
    else
        System.out.println("keyPressed zavolane - Something other : "+e.getKeyCode());
    }
    public void keyReleased (KeyEvent e)
    { System.out.println("keyReleased zavolane - Released code: " +e.getKeyCode());
        System.out.println("------------------------");
    }
    public void keyTyped (KeyEvent e)
    {   System.out.println("keyTyped zavolane - Character : "+e.getKeyChar());

    }
}