package HomeWorkLesson4;

/**
 * Created by Eugene on 10.02.17.
 1. Даны числа int a, b. Найти min.
 */
import java.util.Scanner;
public class HomeWorkLesson4PreProblemsСonditionalsTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int min = rangeMin(a, b);
    }
    public static int rangeMin (int a, int b) {
        int min;
        if(a<b) {
            min = a;
        }
        else {
            min = b;
        }
        System.out.println(min);
        return min;
    }
}
