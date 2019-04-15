import ds.Interval;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntervalListIntersectionsTest {
    IntervalListIntersections ili = new IntervalListIntersections();

    @Test
    public void intervalTest1() {
        Interval[] A = new Interval[] { new Interval(0, 2), new Interval(5, 10), new Interval(13, 23), new Interval(24, 25)};
        Interval[] B = new Interval[] { new Interval(1, 5), new Interval(8, 12), new Interval(15, 24), new Interval(25, 26)};
        Interval[] C = new Interval[] {new Interval(1, 2), new Interval(5,5), new Interval(8, 10),
                new Interval(15, 23), new Interval(24, 24), new Interval(25, 25)};
        assertArrayEquals(C, ili.intervalIntersection(A, B));
    }

    @Test
    public void intervalNull() {
        assertNull(null, null);
    }

    @Test
    public void interval0() {
        assertArrayEquals(new Interval[0], ili.intervalIntersection(new Interval[0], new Interval[0]));
    }
}