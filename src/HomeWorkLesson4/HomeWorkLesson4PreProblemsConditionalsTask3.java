package HomeWorkLesson4;

/**
 * Created by Eugene on 10.02.17.
 3. Даны числа int a, b, c, d. Найти min.
 */
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;
public class HomeWorkLesson4PreProblemsConditionalsTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int min = rangeMin(a ,b, c, d);
    }
    public static int rangeMin (int a, int b, int c, int d)    {
        int min = 0;
        if (a<b&&a<c&&a<d)  {
            min = a;
            System.out.println(min);
        }
        else if (b<a&&b<c&&b<d) {
            min = b;
            System.out.println(min);
        }
        else if (c<a&&c<b&&c<d) {
            min = c;
            System.out.println(min);
        }
        else if (d<a&&d<b&&d<c) {
            min = d;
            System.out.println(min);
        }
        else {
            System.out.println("Please enter the correct values");
        }
        return min;
    }
}
