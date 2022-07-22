package Lab04;

public class EquilateralTriangle extends Shapes implements RegularPolygon {

    private String color = "White";
    private double side = 1;
    private double area = 1;
    private double perimeter = 1;


    public EquilateralTriangle(double sideLength) {
        this.side = sideLength;
        this.color = "White";
    }

    public EquilateralTriangle(String userColor, double sideLength){
        this.color = userColor;
        this.side = sideLength;
    }

    public EquilateralTriangle(String input){
        this.color = input;
        this.side = 1;
    }

    public EquilateralTriangle(){
        this.color = "white";
        this.side = 1;
    }



    @Override
    public double area(double input){
        double result;
        result = input*input;
        result *= 1.73205080757/4;
        return result;
    }


    @Override
    public double perimeter(double input) {
        this.perimeter = input*3;
        return this.perimeter;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String setColor(String userColor) {
        if (userColor == "") {
            color = "White";}
        else color = userColor;
        return color;
    }

    public String toString(){
        return "Shape: Equilateral Triangle" + "\n" + "Color: " + this.color + "\n" + "Side: " + this.side + "\n" + "Area: " + area(this.side) + "\n" + "Perimeter: " + perimeter(this.side) + "\n";
    }


}
