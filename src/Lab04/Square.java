package Lab04;

public class Square extends Shapes implements RegularPolygon {

    private double side = 1;
    private String color= "White";
    private double area = 1;
    private double perimeter = 4;


    public Square(){
        this.color = "white";
        this.side = 1;
    }

    public Square(double sideLength) {
        this.color = "White";
        this.side = sideLength;
    }

    public Square(String userColor){
        this.color = userColor;
        this.side = 1;
    }

    public Square(String userColor, double sideLength){
        this.color = userColor;
        this.side = sideLength;
    }


    public String shape(String input) {
        return "Square";
    }

    @Override
    public double area(double side) {
        this.area = this.side*this.side;
        return this.area;
    }


    @Override
    public double perimeter(double side) {
        this.perimeter = side*4;
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
        return "Shape: Square" + "\n" + "Color: " + this.color + "\n" + "Side: " + this.side + "\n" + "Area: " + area(this.side) + "\n" + "Perimeter: " + perimeter(this.side) +  "\n";
    }

}
