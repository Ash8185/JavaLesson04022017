package HomeWorkLesson4;

import java.util.Scanner;

/**
 * Created by Eugene on 11.02.17.
 Вывод на экран целых чисел от first до last
 */
public class HomeWorkLesson4RangePrinter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer:");

        int first = scanner.nextInt();
        int last = scanner.nextInt();
        int count = rangePrinter(first, last);
    }

    public static int rangePrinter(int first, int last) {
                if (first <= last) {
                    for (; first <= last; first++) {
                System.out.println(first);
            }
        } else {
            for (; first >= last; first--) {
                System.out.println(first);
            }
        }
        return first;
    }

}