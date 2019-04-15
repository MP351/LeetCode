import ds.Interval;

/**
 * Given two lists of closed intervals, each list of intervals is pairwise disjoint and in sorted order.
 * Return the intersection of these two interval lists.
 * (Formally, a closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.
 * The intersection of two closed intervals is a set of real numbers that is either empty, or can be represented as a closed interval.
 * For example, the intersection of [1, 3] and [2, 4] is [2, 3].)
 *
 * https://leetcode.com/problems/interval-list-intersections/
 */
public class IntervalListIntersections {
    public Interval[] intervalIntersection(Interval[] A, Interval[] B) {
        if (A == null || B == null)
            return null;
        if (A.length == 0 || B.length == 0)
            return new Interval[0];

        Interval[] shortI = A.length < B.length ? A : B;
        Interval[] longI = A.length >= B.length ? A : B;
        for (int i=0;i<shortI.length;i++) {
            for (int j=0;j<longI.length;j++) {
                //TODO:
            }
        }
        return null;
    }
}
