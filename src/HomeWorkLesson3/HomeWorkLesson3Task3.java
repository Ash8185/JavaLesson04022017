package HomeWorkLesson3;

/**
 * Created by Eugene on 09.02.17.
 С клавиатуры вводятся 2 строки: message, name
 Написть программу подстановки в сообщении message имени name, вместо шаблона ${name}.
 Использовать метод из класса String
 */
import java.util.Scanner;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Name;

public class HomeWorkLesson3Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter message: ");
        String x = scanner.nextLine();
        System.out.println("Enter your name: ");
        String x1 = scanner.nextLine();
        String x2 = x.replace("${name}", x1);
        System.out.println(x2);

        System.out.println("Enter message 2: ");
        String a = scanner.nextLine();
        System.out.println("Enter your surname: ");
        String a1 = scanner.nextLine();
        String a2 = a.replace("${surname}", a1);
        System.out.println(a2);
    }
}
