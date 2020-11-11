import java.awt.*;
import java.awt.event.*;
 
public class Main
{
    public static void main(String args[])
    {
        GfxApp gfx = new GfxApp();
        gfx.setSize(1000,750);
        gfx.addWindowListener(new WindowAdapter() {public void
        windowClosing(WindowEvent e) {System.exit(0);}});
        gfx.show();
    }
}
 
class GfxApp extends Frame
{
 
    public void paint (Graphics g)
    {
        g.setColor(Color.black);
        int maxX=1024;
        int maxY=768;
        drawSquare1(g,(maxX/2)-maxX/8,(maxY/2)-maxY/8,maxX/4,maxY/4,5);
    }
 
    public void drawSquare1(Graphics g, int x, int y, int width,int height, int n)
    {
        if(width>1 && height>1){
 
        if (n == 5) g.fillRect(x,y,width,height);
        if (n != 4) { g.fillRect(x-width/2,y-height/2,width/2,height/2);drawSquare1(g,x-width/2,y-height/2,width/2,height/2,1);}
        if (n != 3) {g.fillRect(x+width,y-height/2,width/2, height/2);drawSquare1(g,x+width,y-height/2,width/2, height/2,2);}
        if (n != 2){ g.fillRect(x-width/2,y+height,width/2,height/2);drawSquare1(g,x-width/2,y+height,width/2,height/2,3);}
        if (n != 1){ g.fillRect(x+width,y+height,width/2,height/2);drawSquare1(g,x+width,y+height,width/2,height/2,4);}
}
    }
 
    private void delay(double n)
    {
        for (double k = 1; k < n; k+=0.001);
    }
}
