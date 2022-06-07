import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        // Реализовать алгоритм сортировки пузырьком для массива типа int.
        int[] mas = {5, 3, 7, 9, 1, 6, 2, 4, 10, 8};
        for (int i = 0; i < mas.length; i++) {
        }
        System.out.println("Неотсортированный массив" + Arrays.toString(mas));
        int data;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    data = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = data;
                }
            }
            System.out.println(Arrays.toString(mas));
        }
        System.out.println("Отсортированный массив" + Arrays.toString(mas));
    }
}
