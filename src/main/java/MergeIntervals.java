import java.util.ArrayList;

/**
 * Given a collection of intervals, merge all overlapping intervals.
 *
 * Example 1:
 *
 * Input: [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 *
 * Example 2:
 *
 * Input: [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 *
 * https://leetcode.com/problems/merge-intervals/
 */
public class MergeIntervals {
	//TODO:
	public int[][] merge(int[][] intervals) {
		if (intervals == null)
			return null;
		if (intervals.length == 0)
			return new int[0][0];

		ArrayList<int[]> ans = new ArrayList<>();
		int[] tmp;
		for (int i = 0;i<intervals.length;i++){
			for (int j=i+1;j<intervals.length;j++){
				if (intervals[i][1] < intervals[j][0] || intervals[j][1] < intervals[i][0])
					continue;
				else if ((tmp = getIntersection(intervals[i], intervals[j])) != null)
					ans.add(tmp);
			}
		}

		for (int i=0;i<ans.size();i++) {
			for (int j = 0;j<ans.get(i).length;j++) {
				System.out.print(ans.get(i)[j] + " ");
			}
			System.out.println();
		}
		return ans.toArray(new int[0][0]);
	}

	private int[] getIntersection(int[] in1, int[] in2) {
		int begin;
		int end;
		int[] answ = new int[2];

		if ((begin = Integer.min(in1[0], in2[0])) <= (end = Integer.max(in1[1], in2[1]))) {
			answ[0] = begin;
			answ[1] = end;
			return answ;
		}
		return null;
	}
}
