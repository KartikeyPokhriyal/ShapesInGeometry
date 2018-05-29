public class Shape {
    Rectangle rectangle;
    Square square;
    Circle circle;
    Parallelogram parallelogram;
    Triangle triangle;

    public Shape(Rectangle rectangle, Square square, Circle circle, Parallelogram parallelogram, Triangle triangle) {
        this.rectangle = rectangle;
        this.square = square;
        this.circle = circle;
        this.parallelogram = parallelogram;
        this.triangle = triangle;
    }

    public double totalArea() {
        return rectangle.calculateArea() +  square.calculateArea() + circle.calculateArea() + triangle.calculateArea() + parallelogram.calculateArea();
    }
}
