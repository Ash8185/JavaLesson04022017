package HomeWorkLesson4;

/**
 * Created by Eugene on 10.02.17.
 3. Вывести все числа от from до to. from <= to.
 */
import java.util.Scanner;
public class HomeWorkLesson4PreProblemsLoopsTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter variable 'from'. Attention! 'from' must be less than 'to':");
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        int result = HomeWorkLesson4PreProblemsLoopsTask1.rangePrinRow ( from, to);
    }
}