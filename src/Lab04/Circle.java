package Lab04;

public class Circle extends Shapes {

    private String color= "white";
    private double side = 1;
    private double area = 1;
    private double perimeter = 1;

    Circle(double radius){
        this.side = radius;
        this.color = "White";
    }

    Circle(){
        this.color = "White";
        this.side = 1;
    }

    Circle(String userColor){
        this.color = userColor;
        this.side = 1;
    }

    Circle(double radius, String userColor){
        this.color = userColor;
        this.side = radius;
    }

    public double area(double side) {
        this.area = side*side*3.14159;
        return this.area;
    }

    public double perimeter(double input) {
        this.perimeter = input*2*3.14159;
        return this.perimeter;
    }


    public String getColor() {
        return this.color;
    }


    public String setColor(String userColor) {
        this.color = userColor;
        return this.color;
    }

    public String toString(){
        return "Shape: Circle" + "\n" + "Color: " + this.color + "\n" + "radius: " + this.side + "\n" +  "Area: " + area(this.side) + "\n" + "Circumference: " + perimeter(this.side) + "\n";
    }
}
