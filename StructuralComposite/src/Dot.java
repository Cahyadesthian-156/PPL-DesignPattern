import java.awt.Color;
import java.awt.*;
/** 
 * Step 3
*/

public class Dot extends BaseShape {

    private final int DOT_SIZE = 3;

    Dot(int x, int y, Color color) {
        super(x, y, color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public int getWidth() {
        return DOT_SIZE;
    }

    @Override 
    public int getHeight() {
        return DOT_SIZE;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(x-1, y-1, getWidth(), getHeight());
    }
    
}
