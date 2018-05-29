public class Square {
    private double side;

    public Square(double side) throws IllegalArgumentException {
        if(side < 0)
            throw new IllegalArgumentException();
        else
            this.side = side;
    }

    public  double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}
