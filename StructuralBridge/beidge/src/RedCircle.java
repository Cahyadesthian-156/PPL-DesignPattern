/** 
 * Step 2
 * Concrete bridge implementer classes implementing the DrawAPI interface
 * 
*/

public class RedCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle[ color:Red | radius : " + radius + " | x : " + x + " | y : " + y + " ]");
        
    }
    
}
