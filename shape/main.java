package shape;
import shape.square;
import shape.triangle;
import shape.circle;


public class main {
    public static void main(String[] args) {
        square Square = new square();
        Square.calculateArea(5);

        triangle Triangle = new triangle();
        Triangle.calculateArea(4, 6);

        circle Circle = new circle();
        Circle.calculateArea(3.5);
    }
}

