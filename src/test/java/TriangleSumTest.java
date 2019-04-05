import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TriangleSumTest {
    @Parameterized.Parameter(0)
    public int a;
    @Parameterized.Parameter(1)
    public int b;
    @Parameterized.Parameter(2)
    public int c;
    @Parameterized.Parameter(3)
    public boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(
                new Object[]{3, 4, 5, true},
                new Object[]{1, 1, 10, false},
                new Object[]{10, 1, 1, false},
                new Object[]{1, 10, 1, false},
                new Object[]{0, 0, 0, false},
                new Object[]{1, 1, 1, true},
                new Object[]{-2, -1, 1, false},
                new Object[]{3, 4, -5, false}

        );
    }

    @Test
    public void TriangleSum() {
        Triangle Triangle = new Triangle();
        boolean actual = Triangle.TriangleSum(a, b, c);
        assertEquals(expected, actual);
    }
}
