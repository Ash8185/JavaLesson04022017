package HomeWorkLesson4;

/**
 * Created by Eugene on 12.02.17.
 Определение факториала заданного числа n (1..20).
 Если число не соответствует диапазону, бросить исключение IllegalArgumentException
 */

public class HomeWorkLesson4FactorialCalculator {
    public static void main(String[] args) {
        int n = 21;
        long fact = 1;
        if (n<1 || n>20)    {
            throw new IllegalArgumentException();
        }
        fact = rangeFactorial(n);
    }

    public static long rangeFactorial(int n) {
        long fact = 1L;
        for (int i = n; i >= 1; i--)    {
             fact = fact * i;
        }
        System.out.println(fact);
    return fact;
    }
}