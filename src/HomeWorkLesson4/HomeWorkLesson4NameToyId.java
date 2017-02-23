package HomeWorkLesson4;

/**
 * Created by Eugene on 11.02.17.
 Определение идентификатора детской игрушки по ее названию (задача, обратная к Task 4).
 Если данной игрушки нет, бросить исключение IllegalArgumentException.
 Реализовать с помощью switch-case.
 */
import java.util.Scanner;
public class HomeWorkLesson4NameToyId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the tittle, please: ");
        String a = scanner.next();
        rangeNameToy(a);
    }

    public static String rangeNameToy(String id) {
        switch (id) {
            case "Car":
                System.out.println(0);
                break;
            case "Lego":
                System.out.println(1);
                break;
            case "Doll":
                System.out.println(2);
                break;
            case "Puzzle":
                System.out.println(3);
                break;
            default: {
                throw new IllegalArgumentException("Error");
            }
        }
            return id;
    }
}
