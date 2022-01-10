/** 
 * This example woud show how to create complec graphical shapes, 
 * composed of simpler shapes and
 * treat both of the uniformly
 * 
 * Step 1
 * 
*/

import java.awt.*;

public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unselect();
    boolean isSelected();
    void paint(Graphics graphics);
}