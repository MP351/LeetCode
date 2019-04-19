/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive,
 * so "a" is considered a different type of stone from "A".
 *
 * https://leetcode.com/problems/jewels-and-stones/
 */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        if (S == null || J == null || S.isEmpty() || J.isEmpty())
            return 0;

        int count = 0;
        for (int i=1;i<S.length()+1;i++)
            if (J.contains(S.substring(i-1, i)))
                count++;
        return count;
    }
}
