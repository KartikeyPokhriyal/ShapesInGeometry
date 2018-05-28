import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void returnAreaOfTriangle() {
        Triangle triangle = new Triangle(12.0,5.0);
        assertEquals(30.0, triangle.calculateArea(), 0.0001);
    }
}
