public class Task2 {
    public static void main(String[] args) {
        //Даны числа от 100 до 1000. Вывести числа, которые делятся на 3 и не делятся на 9 на цело.
        System.out.println("Делятся на 3 и не делятся на 9 ");
        for (int i = 100; i <= 1000; i++) {
            if (i % 3 == 0 && i % 9 != 0)
                System.out.print(i + ", ");
        }
        System.out.println(" ");
    }
}