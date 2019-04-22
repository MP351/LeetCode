import java.util.HashMap;
import java.util.HashSet;

/**
 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
 * Return the element repeated N times.
 *
 * Note:
 *     4 <= A.length <= 10000
 *     0 <= A[i] < 10000
 *     A.length is even
 *
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 */
public class NRepeatedElementSize2NArray {
	//Stupid straightforward solution
	public int repeatedNTimes(int[] A) {
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int elem : A) {
			if (hm.put(elem, 1) != null) {
				hm.put(elem, hm.get(elem)+1);
			}
		}

		int maxKey = 0;
		int maxVal = 0;
		for (Integer key : hm.keySet()) {
			if (hm.get(key) > maxVal) {
				maxKey = key;
				maxVal = hm.get(key);
			}
		}
		return maxKey;
	}

	public int repeatedNTimesHM(int[] A) {
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int elem : A) {
			if (hm.put(elem, 0) != null)
				return elem;
		}
		return 0;
	}

	public int repeatedNTimesHS(int[] A) {
		HashSet<Integer> hs = new HashSet<>();

		for (int elem : A) {
			if (!hs.add(elem))
				return elem;
		}
		return 0;
	}
}
