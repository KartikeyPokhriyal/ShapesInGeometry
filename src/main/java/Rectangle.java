


public class Rectangle {
    private  double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        if (length > 0 && breadth > 0) {
            this.length = length;
            this.breadth = breadth;
        }
    }

    public  double calculateArea() {
        return length * breadth;
    }
}
