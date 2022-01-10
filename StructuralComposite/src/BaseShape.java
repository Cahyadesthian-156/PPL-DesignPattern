import java.awt.Graphics;
import java.awt.*;

/** 
 * Step 2
*/

public class BaseShape implements Shape {

    public int x;
    public int y;
    public Color color;
    private boolean selected = false;

    BaseShape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }


    @Override
    public int getX() {
        // TODO Auto-generated method stub
        return x;
    }

    @Override
    public int getY() {
        // TODO Auto-generated method stub
        return y;
    }

    @Override
    public int getWidth() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void move(int x, int y) {
        // TODO Auto-generated method stub
        this.x += x;
        this.y += y;
    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        // TODO Auto-generated method stub
        return x>getX() && x<(getX() + getWidth()) && y>getY() && y<(getY()+getHeight());
    }

    @Override
    public void select() {
        // TODO Auto-generated method stub
        selected = true;
    }

    @Override
    public void unselect() {
        // TODO Auto-generated method stub
        selected = false;
    }

    @Override
    public boolean isSelected() {
        // TODO Auto-generated method stub
        return false;
    }

    void enableSelectionStyle(Graphics graphics) {
        graphics.setColor(Color.LIGHT_GRAY);

        Graphics2D g2 = (Graphics2D) graphics;
        float dash1[] = {2.0f};
        g2.setStroke(new BasicStroke(1.0f,
                    BasicStroke.CAP_BUTT,
                    BasicStroke.JOIN_MITER,
                    2.0f, dash1, 0.0f)); 
    }

    void disableSelectionStyle(Graphics graphics) {
        graphics.setColor(color);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke());
    }

    @Override
    public void paint(Graphics graphics) {
        // TODO Auto-generated method stub
        if(isSelected()) {
            enableSelectionStyle(graphics);
        } else {
            disableSelectionStyle(graphics);
        }
    }
    
}
