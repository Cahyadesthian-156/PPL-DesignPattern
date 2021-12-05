public class RoundedShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        // TODO Auto-generated method stub

        if(shapeType.equalsIgnoreCase("REctangle")) {
            return new RoundedRectangle();
        } else if(shapeType.equalsIgnoreCase("Square")) {
            return new RoundedSquare();
        }



        return null;
    }
    
}
