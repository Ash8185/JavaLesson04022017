package HomeWorkLesson4;

/**
 * Created by Eugene on 10.02.17.
 * 5. Вывести все четные числа от 1 до 50.
 */
import java.util.Scanner;
public class HomeWorkLesson4PreProblemsLoopsTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = rangeEvenNumbers(a, b);
    }

    public static int rangeEvenNumbers(int a, int b) {
        int count = 0;
        if (a % 2 != 0) {
            a++;
        }
        for (count = a; count <= b; count+=2) {
            System.out.println(count);
        }
        for (count = a; count >=b; count-=2) {
            System.out.println(count);
        }
        return count;
    }
}