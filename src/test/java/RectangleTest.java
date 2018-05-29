import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class RectangleTest {
    Rectangle rectangle;

    @Test
    public void shouldReturnAreaOfTheRectangle() {
        rectangle = new Rectangle(5.0, 10.0);

        assertEquals(50.0, rectangle.calculateArea(), 0.0);
    }
}
