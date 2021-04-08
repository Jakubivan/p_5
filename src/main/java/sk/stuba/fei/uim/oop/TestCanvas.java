package sk.stuba.fei.uim.oop;
import java.awt.*;
//import javax.swing.*;


class TestCanvas extends Canvas {
    public void paint (Graphics g) {
        Dimension d=getSize();
        int w=d.width,h=d.height;
        int i=0; Color C;
        while (i<=w-1-i && i<=h-1-i) {
            if (2*i<256)
                C=new Color(2*i,255-2*i,255);
            else
                C=new Color(255,0,255);
            g.setColor(C);
            g.drawRect(i,i,w-1-2*i,h-1-2*i);
            i++; }
    }
}
