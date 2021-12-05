// Step 4
// Use the Factory to get object of concrete class by passing an information such as type.

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of circle and call its draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SquarE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("rectangLe");
        shape3.draw();
    
    }
}
