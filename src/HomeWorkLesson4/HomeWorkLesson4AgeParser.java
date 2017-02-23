package HomeWorkLesson4;

/**
 * Created by Eugene on 11.02.17.
 Парсинг строки возраста (в строке представлено число типа int).
 Можно пользоваться стандартными функциями.
 Если входная строка является числом, что не соответствует диапазону 1..120,
 бросить исключение IllegalArgumentException.
 */
import java.util.Scanner;
public class HomeWorkLesson4AgeParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int n = scanner.nextInt();
        int a = rangeParser(n);
    }

    public static int rangeParser(int n)    {
        if (n < 1 || n > 120) {
            throw new IllegalArgumentException("Age must be in the range [1..120]");
        } else
        return n;
    }

}