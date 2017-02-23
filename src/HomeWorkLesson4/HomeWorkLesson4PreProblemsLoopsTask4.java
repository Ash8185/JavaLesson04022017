package HomeWorkLesson4;

/**
 * Created by Eugene on 10.02.17.
 4. Вывести все числа от from до to. from, to - любые.
 */
import java.util.Scanner;
public class HomeWorkLesson4PreProblemsLoopsTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer:");
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        int result = HomeWorkLesson4PreProblemsLoopsTask1.rangePrinRow ( from, to);
    }
}
