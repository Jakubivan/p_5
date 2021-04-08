package sk.stuba.fei.uim.oop;
import java.awt.*;
//import javax.swing.*;


class TestCanvas extends Canvas {
    public void paint (Graphics g) {
        Dimension d=getSize();
        int w=d.width,h=d.height;
        g.drawLine(0,0,w-1,h-1);
        g.drawLine(0,h-1,w-1,0);
        g.drawRect(0,0,w-1,h-1); }
}