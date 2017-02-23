package HomeWorkLesson4;

/**
 * Created by Eugene on 10.02.17.
 1. Вывести все числа от 10 до 30.
 */
import java.util.Scanner;
public class HomeWorkLesson4PreProblemsLoopsTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = rangePrinRow(a, b);
    }

    public static int rangePrinRow(int a, int b) {
        int result = 0;
        if (a <= b) {
            for (result = a; result < b; ) {
                result = a++;
                System.out.println(result);
            }
        } else {
            for (result = a; result > b; ) {
                result = a--;
                System.out.println(result);
            }
        }
        return result;
    }
}