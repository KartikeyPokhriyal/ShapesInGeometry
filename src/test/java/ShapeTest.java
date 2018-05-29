import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeTest {

@Test
    public void shouldReturnTotalAreaOfAllTheShapes() {
    Shape shape = new Shape(new Rectangle(2.0,3.0), new Square(2.0), new Circle(1.0), new Parallelogram(2.0,2.0,5.0), new Triangle(2.0,4,5));

    assertEquals(27.14, shape.totalArea(), 0.001);
}
}
