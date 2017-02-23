package HomeWorkLesson4;

/**
 * Created by Eugene on 10.02.17.
 4. Даны числа int a, b, c. Вывести их в порядке возрастания.
 */import java.util.Scanner;
public class HomeWorkLesson4PreProblemsConditionalsTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integer: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = rangeOutpuAscendingOrder(a, b, c);

    }
    public static int rangeOutpuAscendingOrder (int a, int b, int c)    {
        int result;
        if (a<b&&a<c&&b<c)   {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        else if (b<a&&b<c&&a<c)  {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
        else if (c<a&&c<b&&a<b)  {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
        else if (a<b&&a<c&&c<b)  {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }
        else if (b<c&&b<a&&c<a)  {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }
        else if (c<b&&c<a&&b<a)  {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
        else {
            System.out.println("Enter three different integers, please");
        }
        return result = 0;
    }
}