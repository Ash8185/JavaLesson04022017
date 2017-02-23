package HomeWorkLesson4;

/**
 * Created by Eugene on 11.02.17.
 Определение корректности заданного возраста.
 Возраст может принимать значения в диапазоне 1..120.
 */
import java.util.Scanner;
public class HomeWorkLesson4IsAgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int i = scanner.nextInt();
        int isAge = RangeAgeChecker(i);
        }

    public static int RangeAgeChecker(int n) {
        if (0<n && n <=120) {
            System.out.println("true");
        }
        else System.out.println("false");
        return n;
    }

}
