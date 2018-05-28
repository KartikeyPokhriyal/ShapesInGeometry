import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void returnAreaOfRightTriangle() {
        Triangle triangle = new Triangle(12.0,5.0, 9.0);

        assertEquals(30.0, triangle.calculateArea(), 0.0001);
    }

    @Test
    public void returnPerimeterOfRightTriangle() {
        Triangle triangle = new Triangle(12.0,5.0,9.0);

        assertEquals(26.0, triangle.calculatePerimeter(), 0.0001);
    }
}
