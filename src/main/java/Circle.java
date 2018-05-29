


public class Circle {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) throws IllegalArgumentException {
        if(radius < 0)
            throw  new IllegalArgumentException();
        else
            this.radius = radius;
    }

    public double calculateArea() {
         return PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * PI * radius;

    }
}
