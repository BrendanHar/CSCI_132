package Lab04;

public class Rectangle extends Shapes {

    private double width = 1;
    private double height = 1;
    private String color = "White";
    private double area = 1;
    private double perimeter = 4;


    public Rectangle(){
        this.color = "White";
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(String userColor){
        this.color = userColor;
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double userWidth, double userHeight){
        this.color = "White";
        this.width = userWidth;
        this.height = userHeight;
    }
    public Rectangle(double userWidth, double userHeight, String userColor){
        this.color = userColor;
        this.width = userWidth;
        this.height = userHeight;
    }

    public double area(double userHeight, double userWidth) {
        return this.area = this.height * this.width;
    }


    public double perimeter(double width, double height) {
        this.width = width;
        this.height = height;
        this.perimeter = this.width*2 + this.height*2;
        return this.perimeter;
    }


    public String setColor(String userColor) {
        if (userColor == ""){
            this.color = "White";
        }
        else
            this.color = userColor;
        return this.color;
    }


    public String toString(){
        return "Shape: Rectangle" + "\n" + "Color: " + this.color + "\n" + "Width: " + this.width + "\n" + "Height: " + this.height + "\n" + "Area: " + area(this.width, this.height) + "\n" + "Perimeter: " + perimeter(this.width, this.height) + "\n";
    }
}
