/** 
 * Step 5
 * use SHape and DrawAPI to draw diffrent coloroed circles
 * 
*/

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Shape redCircle = new Circle(new RedCircle(), 10, 100,100);
        Shape blueCirc = new Circle(new BlueCircle(), 10, 120, 120);

        redCircle.draw();
        blueCirc.draw();
    }
}
