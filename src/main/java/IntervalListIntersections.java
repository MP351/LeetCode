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
        for (int i=0, j=0;i<A.length && j<B.length;) {
            if (A[i].end < B[j].start)
                i++;
            else if (B[j].end < A[i].start)
                j++;
            else if ((tmp = getIntersection(A[i], B[j])) != null) {
                al.add(tmp);
                if (A[i].end < B[j].end)
                    i++;
                else
                    j++;
            }
        }
        return al.toArray(new Interval[0]);
    }

    private Interval getIntersection(Interval in1, Interval in2) {
        int begin;
        int end;

        if ((begin = Integer.max(in1.start, in2.start)) <= (end = Integer.min(in1.end, in2.end)))
            return new Interval(begin, end);
        return null;
    }
}
