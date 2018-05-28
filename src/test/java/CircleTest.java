
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void shouldReturnAreaOfCircleForRadiusOne() {
        Circle circle = new Circle(-1.0);

        assertEquals(3.14, circle.calculateArea(), 0.001);
    }

}
