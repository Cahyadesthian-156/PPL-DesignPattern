import java.awt.Color;
import java.awt.Graphics;

//step 5

public class Rectangle extends BaseShape{

    public int height;
    public int width;

    Rectangle(int x, int y, int widht, int height, Color color) {
        super(x, y, color);
        //TODO Auto-generated constructor stub
        this.height = height;
        this.width = widht;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawRect(x, y, getWidth()-1, getHeight()-1);
    }
    
}
