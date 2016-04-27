package my.triangle.Test;

import my.triangle.Objects.Triangle;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex on 28.04.2016.
 */
public class TriangleTest {
    public final double ACCURACY = 1e-10;

    @Test
    public void testSolve(){
        Triangle triangle = new Triangle (90, 7, 3);
        assertEquals(10.5, triangle.solve(), ACCURACY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroValue(){
        Triangle triangle = new Triangle(45, 0, 5);
        triangle.solve();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBigAngle(){
        Triangle triangle = new Triangle(179, 5, 5);
        triangle.solve();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSmallAngle(){
        Triangle triangle = new Triangle(0, 5, 5);
        triangle.solve();
    }


}
