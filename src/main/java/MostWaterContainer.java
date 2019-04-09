/**
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 *
 * Note: You may not slant the container and n is at least 2.
 *
 * https://leetcode.com/problems/container-with-most-water/
 */
public class MostWaterContainer {
    public int maxArea(int[] height) {
        int m = 0;
        int j = height.length-1;
        for (int i=0;i < j;) {
            for (;j>0;) {
                int t;
                if (height[i] < height[j]) {
                    t = height[i] * (j - i);
                    m = m < t ? t : m;
                    i++;
                    break;
                } else {
                    t = height[j] * (j - i);
                    m = m < t ? t : m;
                    j--;
                }
            }
        }

        return m;
    }
}
