package HomeWorkLesson4;

/**
 * Created by Eugene on 12.02.17.
 Вывод на экран матрицы rows * cols, заполненной filler.
 Если rows < 0 или cols < 0, бросить исключение IllegalArgumentException.
 */
public class HomeWorkLesson4FilledMatrixPrinter {
    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;
        int filler = rangeMatrixPrinter(rows,cols);

    }
    public static int rangeMatrixPrinter(int rows, int cols) {
        int filler = -1;
        if (rows > 0 && cols > 0){
            for (int i = 1; i <= rows; i++){
                for (int j = 1; j <= cols; j++){
                    System.out.print(filler);
                }
                System.out.println();
            }
        } else if (rows < 0 || cols < 0){
            throw new IllegalArgumentException();
        }
    return filler;
    }
}

