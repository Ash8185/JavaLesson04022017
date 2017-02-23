package HomeWorkLesson3;

/**
 * Created by Eugene on 09.02.17.
 С клавиатуры вводится чило тип double x. Найти результат функции
 */
import java.util.Scanner;

import static java.lang.Math.*;

public class HomeWorkLesson3Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter double x: ");
        String a = scanner.nextLine();
        double x = Double.parseDouble(a);
        double f = log(sin(x) + Math.pow(Math.E,x) * (sqrt(x)/ PI));
        System.out.println("f(x) = "+ f);
    }
}
