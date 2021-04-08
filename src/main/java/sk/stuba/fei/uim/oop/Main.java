package sk.stuba.fei.uim.oop;



public class Main{

    public static void main (String args[])
    {
        TestFrame f=new TestFrame();
        f.add(new TestCanvas());
        f.setSize(300,300);
        f.setVisible(true);
    }
}