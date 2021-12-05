// Step 6
// Use the FactoryProducer to get AbstractFactory in order to get factories of concrete classes by passing an information such as type.

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        //get Shape Facotry
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);    

        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Square");
        shape2.draw();


        AbstractFactory shapeFactoryRounded = FactoryProducer.getFactory(true);

        Shape shape3rounded = shapeFactoryRounded.getShape("Rectangle");
        shape3rounded.draw();

        Shape shape4rounded = shapeFactoryRounded.getShape("Square");
        shape4rounded.draw();
    
    }
}
