//package Lab04;
//
//public class RegularPentagon implements RegularPolygon {
//
//    private String color = "White";
//    private double side = 1;
//
//    public RegularPentagon(double sidelength){
//        this.color = "White";
//        this.side = sidelength;
//    }
//
//    public RegularPentagon(String userColor, double sideLength){
//        this.color = userColor;
//        this.side = sideLength;
//    }
//
//    public RegularPentagon(String userColor){
//        this.color = userColor;
//        this.side = 1;
//    }
//
//    public RegularPentagon(){
//        this.color = "White";
//        this.side = 1;
//    }
//
//
//    @Override
//    public String shape(String input) {
//        return "Pentagon";
//    }
//
//    @Override
//    public String color(String input) {
//        return null;
//    }
//
//    @Override
//    public double area(double input) {
//        double data = input*input;
//        double result = data*1.7204774006;
//        return result;
//    }
//
//    @Override
//    public double side(double input) {
//        return 0;
//    }
//
//    @Override
//    public double perimeter(double side) {
//        double result = side*5;
//        return result;
//    }
//
//    @Override
//    public String getColor() {
//        return null;
//    }
//
//    @Override
//    public String setColor(String userColor) {
//        return null;
//    }
//
//    @Override
//    public double getSide() {
//        return this.side;
//    }
//}
