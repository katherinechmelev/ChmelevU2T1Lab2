public class Circle {

    // instance variables
    private double radius;

    // constructor
    public Circle(double rad) {
        radius = rad;
    }

    // method to print area
    public void printArea() { // if the return type is not void, you need a return statement at the end of the method
        double area = 3.14 * radius * radius;
        System.out.println("My area is: " +  area);
    } //called a void method
    // all code inside a method are in their own 'scope'
}
