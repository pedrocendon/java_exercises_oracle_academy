import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class RectangleApplet extends Applet {

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        Rectangle testRectangle = new Rectangle(5,10,20,30);
        g2.draw(testRectangle);
    }
}
