
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void shouldReturnAreaOfCircleForRadiusOne() {
        Circle circle = new Circle(1.0);

        assertEquals(3.14, circle.calculateArea(), 0.001);
    }

    @Test
    public void shouldReturnAreaOfCircle() {
        Circle circle = new Circle(3.0);

        assertEquals(28.25, circle.calculateArea(), 0.0099999999999998);
    }

    @Test
    public void shouldReturnPerimeterOfCircleForRadiusOne() {
        Circle circle = new Circle(1.0);

        assertEquals(6.28, circle.calculatePerimeter(), 0.0099999999999998);
    }

    @Test
    public void shouldReturnPerimeterOfCircle() {
        Circle circle = new Circle(3.0);

        assertEquals(18.84, circle.calculatePerimeter(), 0.0099999999999998);
    }
}
