package HomeWorkLesson4;

/**
 * Created by Eugene on 11.02.17.
 Определение названия детской игрушки по ее идентификатору. Если данной игрушки нет,
 бросить исключение IllegalArgumentException. Реализовать с помощью if-else цепочки.
 Виды игрушек:
 0 – Car.
 1 – Lego.
 2 – Doll.
 3 – Puzzle.
 */
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;
public class HomeWorkLesson4IdToyName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer from 0 to 3");
        int a = scanner.nextInt();
        int n = rangeIdToy(a);
    }

    public static int rangeIdToy(int a) {
        if (a == 0) System.out.println("Car");
        else if (a == 1) System.out.println("Lego");
        else if (a == 2) System.out.println("Doll");
        else if (a == 3) System.out.println("Puzzle");
        else throw new IllegalArgumentException();
    return a;
    }
}