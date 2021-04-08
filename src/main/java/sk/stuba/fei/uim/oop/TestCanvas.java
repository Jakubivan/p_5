package sk.stuba.fei.uim.oop;
import java.awt.*;
//import javax.swing.*;
import java.util.*;

class TestCanvas extends Canvas
{
    public HashSet<Rectangle> OurObjects = new HashSet<>();
    public void NewObjects ()
    {	int i = 0;
        int j = 20;
        while (i<8)
        {	OurObjects.add(new Rectangle(10,j,20,20));
            j = j + 30; i++;
        }
    }

    public void paint (Graphics g)
    {	Rectangle ActRect;
        Iterator it = OurObjects.iterator();
        while (it.hasNext())
        {	Object Actual = it.next();
            if (Actual instanceof Rectangle)
            {	ActRect = (Rectangle) Actual;
                System.out.println(ActRect.y);
                g.drawRect(ActRect.x, ActRect.y, ActRect.width, ActRect.height);
            }
        }
    }
}