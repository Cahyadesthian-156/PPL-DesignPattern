/** 
 * Step 2
 * Concrete bridge implementer classes implementing the DrawAPI interface
 * 
*/

public class BlueCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle[ color:Blue | radius : " + radius + " | x : " + x + " | y : " + y + " ]");
        
    }
    
}
