package Lab04;

import java.util.Scanner;

public class ShapesDemo {

    public static void main(String[] args) {


        Rectangle myRectangle = new Rectangle(2.5, 3, "Brown");
        Rectangle myRectangle_2 = new Rectangle(3,2);
        Shapes myRectangle_3 = new Rectangle("Blue");
        Shapes myPoly = new Square();
        Shapes mySquare = new Square("Yellow", 2);
        Shapes mySquare_2 = new Square("Orange");
        Shapes myTriangle_1 = new EquilateralTriangle(3);
        Shapes myTriangle_2 = new EquilateralTriangle("Yellow");
        Shapes myTriangle_3 = new EquilateralTriangle("Red", 2);
        Shapes myCircle_1 = new Circle("Purple");
        Shapes myCircle_2 = new Circle(2);
        Shapes myCircle_3 = new Circle(3, "Black");



        System.out.println(myRectangle);
        System.out.println(myRectangle_2);
        System.out.println(myRectangle_3);
        System.out.println(myPoly);
        System.out.println(mySquare);
        System.out.println(mySquare_2);
        System.out.println(myTriangle_1);
        System.out.println(myTriangle_2);
        System.out.println(myTriangle_3);
        System.out.println(myCircle_1);
        System.out.println(myCircle_2);
        System.out.println(myCircle_3);




        System.out.println("----------------------------------------------------");
        System.out.println("<end>");
//        scr.close();

    }
}
