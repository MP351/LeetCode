/**
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 *     I can be placed before V (5) and X (10) to make 4 and 9.
 *     X can be placed before L (50) and C (100) to make 40 and 90.
 *     C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.
 *
 * https://leetcode.com/problems/integer-to-roman/
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int div = 0;
        if ((div = num/1000) > 0) {
            for (int i=0;i<div;i++)
                sb.append('M');
            num %= 1000;
        }
        if ((div = num/100) > 0) {
            switch (div) {
                case 9:
                    sb.append("CM");
                    break;
                case 8:
                    sb.append("DCCC");
                    break;
                case 7:
                    sb.append("DCC");
                    break;
                case 6:
                    sb.append("DC");
                    break;
                case 5:
                    sb.append("D");
                    break;
                case 4:
                    sb.append("CD");
                    break;
                case 3:
                    sb.append("CCC");
                    break;
                case 2:
                    sb.append("CC");
                    break;
                case 1:
                    sb.append("C");
                    break;
            }
            num %= 100;
        }

        if ((div = num / 10) > 0) {
            switch (div) {
                case 9:
                    sb.append("XC");
                    break;
                case 8:
                    sb.append("LXXX");
                    break;
                case 7:
                    sb.append("LXX");
                    break;
                case 6:
                    sb.append("LX");
                    break;
                case 5:
                    sb.append("L");
                    break;
                case 4:
                    sb.append("XL");
                    break;
                case 3:
                    sb.append("XXX");
                    break;
                case 2:
                    sb.append("XX");
                    break;
                case 1:
                    sb.append("X");
                    break;
            }
            num %= 10;
        }

        if ((div = num) > 0) {
            switch (div) {
                case 9:
                    sb.append("IX");
                    break;
                case 8:
                    sb.append("VIII");
                    break;
                case 7:
                    sb.append("VII");
                    break;
                case 6:
                    sb.append("VI");
                    break;
                case 5:
                    sb.append("V");
                    break;
                case 4:
                    sb.append("IV");
                    break;
                case 3:
                    sb.append("III");
                    break;
                case 2:
                    sb.append("II");
                    break;
                case 1:
                    sb.append("I");
                    break;
            }
        }
        return sb.toString();
    }
}
