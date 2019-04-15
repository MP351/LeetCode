import ds.Interval;

import java.util.ArrayList;

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

        Interval tmp;
        ArrayList<Interval> al = new ArrayList<>();
        for (Interval in1 : A) {
            for (Interval in2 : B) {
                if ((tmp = getIntersection(in1, in2)) != null) {
                    al.add(tmp);
                }
            }
        }
        return al.toArray(new Interval[0]);
    }

    private Interval getIntersection(Interval in1, Interval in2) {
        int begin = 0;
        int end = 0;

        if ((begin = Integer.max(in1.start, in2.start)) <= (end = Integer.min(in1.end, in2.end)))
            return new Interval(begin, end);
        return null;
    }
}
