// Step 4
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        ShapeCache.loadCache();
        
        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape of first cloned: " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape of second clone: " + clonedShape2.getType());

    }
}
