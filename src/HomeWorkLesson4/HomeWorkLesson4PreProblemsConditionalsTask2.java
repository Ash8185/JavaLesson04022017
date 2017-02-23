package HomeWorkLesson4;

/**
 * Created by Eugene on 10.02.17.
 2. Даны числа int a, b, c. Найти min.
 */
import java.util.Scanner;
public class HomeWorkLesson4PreProblemsConditionalsTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min = rangeMin(a,b,c);
    }



    public static int rangeMin (int a, int b, int c)    {
        int min = 0;
        if (a<b&&a<c) {
            min = a;
            System.out.println(min);
        }
        else if (b<a&&b<c)  {
            min = b;
            System.out.println(min);
        }
        else if (c<a&&c<b)    {
            min = c;
            System.out.println(min);
        }
        else {
            System.out.println("The numbers should be different");
        }
        return min;
    }
}
