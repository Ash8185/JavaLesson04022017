package HomeWorkLesson3;

/**
 * Created by Eugene on 09.02.17.
 С клавиатуры вводятся данные:
 1. Имя
 2. Фамилия
 3. Возраст
 Вывести эту информацию в приветственной форме от первого лица
 */
import java.util.Scanner;
public class HomeWorkLesson3Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name, please ");
        String a = scanner.nextLine();
        System.out.println("Enter your surname, please ");
        String b = scanner.nextLine();
        System.out.println("Enter your age, please ");
        String c = scanner.nextLine();
        System.out.println("Hello! I'm " + a + " " + b + ", " + c + " years old");
    }
}
