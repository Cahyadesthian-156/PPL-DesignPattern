/** 
 * Step 3
 * Abstract class Shape that using DrawAI interface
*/

public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI =  drawAPI;
    }

    public abstract void draw();
}
