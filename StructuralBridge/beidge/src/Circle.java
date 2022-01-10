/** 
 * Step 4
 * Concrete class implementing Shape interface
 * 
*/

public class Circle extends Shape {

    private int x,y,radius;

    protected Circle(DrawAPI drawAPI, int rad, int xpos, int ypos) {
        super(drawAPI);
        this.x = xpos;
        this.y = ypos;
        this.radius = rad;
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        drawAPI.drawCircle(radius, x, y);
    }
    
}
