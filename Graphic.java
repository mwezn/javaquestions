import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Graphic
{   
    public Graphics GClass;
    public Graphics2D G2D;
    public  void Draw_Circle(JFrame jf,int radius , int  xLocation, int yLocation)
    {
        GClass = jf.getGraphics();
        GClass.setPaintMode();
        GClass.setColor(Color.MAGENTA);
        GClass.fillArc(xLocation, yLocation, radius, radius, 0, 360);
        GClass.drawLine(100, 100, 200, 200);    
    }
    public static void main(String[] args){
        //Graphic graph= new Graphic();
        JFrame jfr= new JFrame("Demo drawing");
        //graph.Draw_Circle(jfr, 10, 100, 100);
        //jfr.getContentPane().add(emptyLabel,BorderLayout.CENTER);
        jfr.pack();
        jfr.setVisible(true);


    }

}
