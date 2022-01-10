import java.awt.Color;
// Step 4
import java.awt.Graphics;

public class Circle extends BaseShape {

    public int radius;

    Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        //TODO Auto-generated constructor stub
        this.radius = radius;
    }

    @Override
    public int getWidth() {
        return radius*2;
    }

    @Override 
    public int getHeight() {
        return radius*2;
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(x, y, getWidth()-1, getHeight()-1);
    }
    
}
