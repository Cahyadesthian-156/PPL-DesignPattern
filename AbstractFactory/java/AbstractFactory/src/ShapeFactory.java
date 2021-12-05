// Step 4
// Create Factory classes extending AbstractFactory to generate object of concrete class based on given information.

public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        // TODO Auto-generated method stub

        if(shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }




        return null;
    }
    
}
