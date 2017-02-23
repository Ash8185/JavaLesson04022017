package HomeWorkLesson4;

/**
 * Created by Eugene on 12.02.17.
 * Вывод на экран чётных чисел от first до last. Если first > last, ничего не выводить.
 */
import java.util.Scanner;
public class HomeWorkLesson4EvensRangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int last = scanner.nextInt();
        int n = rangeEvensPrinter(first, last);
    }

    public static int rangeEvensPrinter(int first, int last) {
        if (first > last) {
        } else if (first % 2 != 0) {
            first++;
        }
        for (; first < last; ) {
            System.out.println(first);
            first += 2;
        }
        return first;
    }
}
