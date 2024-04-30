package shapes;

import java.awt.Color;

public class ShapeDriver {

    public static void main(String[] args) {
        Square sq1 = new Square("Black", 5, true);
        Rectangle rec1 = new Rectangle("Red", 5, 3);

        System.out.println("The area of the rectangle is: " + rec1.getArea());
        System.out.println("The area of the square is: " + sq1.getArea());
        System.out.println("The square is " + (sq1.getIsFilled()?"filled":"not filled"));
    }
}
