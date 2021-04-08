package sk.stuba.fei.uim.oop;
import javax.swing.*;


public class Main{

    	public static void main (String args[])
        {	JFrame F=new JFrame();
            F.setSize(300,300);
            TestCanvas Can = new TestCanvas();
            Can.NewObjects();
            F.add("Center", Can);
            F.setVisible(true);
        }
    }