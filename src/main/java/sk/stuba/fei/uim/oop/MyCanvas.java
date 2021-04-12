package sk.stuba.fei.uim.oop;

import java.awt.*;
import javax.swing.*;

public class MyCanvas extends Canvas {
    @Override
    public void paint(Graphics g) {
        g.drawLine(0,0,500,500);
    }
}
