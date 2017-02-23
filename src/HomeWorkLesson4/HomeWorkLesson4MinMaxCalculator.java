package HomeWorkLesson4;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by Eugene on 11.02.17.
 Нахождение минимума/максимума двух чисел.
 */
public class HomeWorkLesson4MinMaxCalculator {
    public static void main(String[] args) {
        int max = rangeMax( 5, -2);
            System.out.println("max = " + max);
        int min = rangeMin(5, -2);
            System.out.println("min = " + min);

    }
    public static int rangeSum(int from, int to)    {
        int sum = 0;
        for (int n = from; n<=to; n++)  {
            sum+=n;
        }
        return sum;
    } // creator
    public static int rangeMax(int a, int b) {
        int max = (a > b) ? a : b;
        return max;
    }
    public static int rangeMin(int a, int b) {
        int min = (a < b) ? a : b;
        return min;
    }
}
