package HomeWorkLesson4;

import java.util.Scanner;

/**
 * Created by Eugene on 10.02.17.
 6. Вывести все нечетные числа от 100 до 70.
 */
public class HomeWorkLesson4PreProblemsLoopsTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = rangeOddNumbers(a, b);
    }

    public static int rangeOddNumbers(int a, int b) {
        int count = 0;
        if (a < b && a % 2 == 0) {
            a++;}
        for (count = a; count <= b; count += 2) {
                System.out.println(count);
            }
            if (a > b  && a % 2 == 0) {
            a--;}
            for (count = a; count >= b; count -= 2) {
                System.out.println(count);
            }
        return count;
    }
}