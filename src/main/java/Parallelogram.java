


public class Parallelogram {
    private double side;
    private double base;
    private double height;

    public Parallelogram(double side, double base, double height) throws IllegalArgumentException {
         if (side < 0 && base < 0 && height < 0) {
            throw new IllegalArgumentException();
         } else {
            this.side = side;
            this.base = base;
            this.height = height;
        }
    }

    public double calculatePerimeter() {
        return 2 * (base + side);
    }

    public double calculateArea() {
        return base * height;
    }
}