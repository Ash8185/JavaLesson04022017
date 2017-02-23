package HomeWorkLesson4;

/**
 * Created by Eugene on 10.02.17.
 7. Вывесит все четные числа от from до to. from <= to.
 */
import java.util.Scanner;
public class HomeWorkLesson4PreProblemsLoopsTask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers. Attention!First integer shall be less second!!!");
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        int results = HomeWorkLesson4PreProblemsLoopsTask5.rangeEvenNumbers(from,to);
    }
}





