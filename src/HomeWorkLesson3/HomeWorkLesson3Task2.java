package HomeWorkLesson3;

/**
 * Created by Eugene on 09.02.17.
 *
 * С клавиатуры вводятся данные:
 * 1. Число х в двоичной системе исчисления
 * 2. Число у в восьмеричной системе исчисления
 * 3. Число z в шестнадцатеричной системе исчисления
 * Вывести сумму X+Y+Z
 * */
import java.util.Scanner;
public class HomeWorkLesson3Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X in Bin: ");
        String x1 = scanner.nextLine();
        System.out.println("Enter Y in Oct: ");
        String y1 = scanner.nextLine();
        System.out.println("Enter Z in Hex; ");
        String z1 = scanner.nextLine();
        int x = Integer.parseInt(x1, 2);
        int y = Integer.parseInt(y1, 8);
        int z = Integer.parseInt(z1, 16);
        int a = x+y+z;
        System.out.println(a);
    }

}
