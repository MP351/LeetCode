import java.util.ArrayList;

/**
 * Write a class StockSpanner which collects daily price quotes for some stock, and returns the span of that stock's price for the current day.
 * The span of the stock's price today is defined as the maximum number of consecutive days (starting from today and going backwards) for which the price of the stock was less than or equal to today's price.
 * For example, if the price of a stock over the next 7 days were [100, 80, 60, 70, 60, 75, 85], then the stock spans would be [1, 1, 1, 2, 1, 4, 6].
 *
 * https://leetcode.com/problems/online-stock-span/
 */
public class OnlineStockSpan {
    private int last = 0;
    public OnlineStockSpan() {
        array = new int[10000];
    }

    private int[] array;
    public int next1(int price) {
        if (price < 1)
            return 0;
        array[last++] = price;

        int count = 0;
        for (int i=last-1;i>=0;i--) {
            if (array[i] <= price)
                count++;
            else
                break;
        }
        return count;
    }

    private int[][] martix = new int[10000][2];
    public int next(int price) {
        if (price < 1)
            return 0;

        int w = 1;
        while (last > 0 && martix[last-1][0] <= price) {
            w += martix[--last][1];
        }

        martix[last][0] = price;
        martix[last][1] = w;

        return martix[last++][1];
    }
}
