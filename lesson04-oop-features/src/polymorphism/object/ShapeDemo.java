package polymorphism.object;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();
        shape.calS();

        // Rectangle objects
        Rectangle rec = new Rectangle();
        rec.draw();
        rec.calS();

        // Square objects
        Square square = new Square();
        square.draw();
        square.calS();

        System.out.println("*******************************");

        Shape s1 = new Rectangle();
        s1.calS();
        s1.draw();

        Shape s2 = new Square();
        s2.calS();
        s2.draw();

        Shape[] shapes = {rec, square,s1, s2};

        for(Shape shapeItem : shapes){
            shapeItem.draw();
            shapeItem.calS();
            if(shapeItem != null && shapeItem.getClass() == Square.class){
                Square runtimeShape = (Square)shapeItem;
                runtimeShape.clear();
            }
        }

    }
}
