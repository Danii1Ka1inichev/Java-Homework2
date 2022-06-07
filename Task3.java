import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //Даны две матрицы (два двумерных int массива одинаковой размерности). Найти сумму матриц.
        int[][] dataBase1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] dataBase2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] dataBase3 = new int[3][3];

        if (dataBase1.length == dataBase2.length) {

            for (int i = 0; i < dataBase1.length; i++) {
                for (int j = 0; j < dataBase1.length; j++) {
                    dataBase3[i][j] = dataBase1[i][j] + dataBase2[i][j];
                }
            }
            for (int l = 0; l < dataBase3.length; l++) {
                System.out.println(Arrays.toString(dataBase3[l]));
            }
        }
        else {
            System.out.println("Матрица не равна");
        }
    }
}