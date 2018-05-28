import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParallelogramTest {

    @Test
    public void returnPerimeterOfParallelogram() {
        Parallelogram parallelogram = new Parallelogram(2.0, 3.0, 4.0);
        assertEquals(10.0, parallelogram.calculatePerimeter(), 0.0001);

    }
}
