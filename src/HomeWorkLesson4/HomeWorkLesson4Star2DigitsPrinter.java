package HomeWorkLesson4;

import java.util.Scanner;
import java.lang.Math;

/**
 * Created by Eugene on 14.02.17.
 * Вывод в консоль цифр целого числа. Если число отрицательное, вывести знак "-".
 * Использование преобразования числа в строку запрещено.
 */
public class HomeWorkLesson4Star2DigitsPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = rangeGetCountsOfDigits(n);  //узнаем количество цифр в числе
        count = (count / count) * ((int) Math.pow(10, (count - 1))); //определяем количество выводимых чисел
        for (; n > 0 && count > 0; ) {
            System.out.print(n / count % 10 + " ");
            count /= 10;
        }
        if (n < 0) {
            System.out.print("- ");
        }
        for (; n < 0 && count > 0; ) {
            System.out.print((n * -1) / count % 10 + " ");
            count /= 10;
        }


    }

    public static int rangeGetCountsOfDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}