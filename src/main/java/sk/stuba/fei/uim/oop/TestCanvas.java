package sk.stuba.fei.uim.oop;
import java.awt.*;
//import javax.swing.*;
import java.util.*;

class TestCanvas extends Canvas
{
    public HashSet<Rectangle> OurObjects = new HashSet<>();
    public void NewObjects ()
    {	int i = 20;
        int j = 0;
        while (j<5)
        {	OurObjects.add(new Rectangle( i,20,20,20));
            j++;
            i=i+30;
        }
    }

    public void paint (Graphics g)
    {	for (Rectangle ActRect : OurObjects)
    {
        System.out.println(ActRect.y);
        g.drawRect(ActRect.x, ActRect.y, ActRect.width, ActRect.height);
    }
    }
}
