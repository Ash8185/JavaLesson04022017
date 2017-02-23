package HomeWorkLesson4;

/**
 * Created by Eugene on 11.02.17.
 Вывод на экран целых чисел от first до last c шагом step.
 Если вывод может привести к зацикливанию,
 бросить исключение IllegalArgumentException.
 */
import java.util.Scanner;
public class HomeWorkLesson4RangeWitnStepPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int last = scanner.nextInt();
        int step = scanner.nextInt();
        int n = rangeWithStep(first, last, step);
    }

    public static int rangeWithStep(int first, int last, int step) {
        int n;
        if (first < last) {
            for (n = first; n <= last; n += step) {
                System.out.println(n);
                if (step <= 0) {
                    throw new IllegalArgumentException();
                }
            }
        } else {
            for (n = first; n >= last; n += step) {
                System.out.println(n);
                if (step >= 0) {
                    throw new IllegalArgumentException();
                }
            }
        }
        return n;
    }
}