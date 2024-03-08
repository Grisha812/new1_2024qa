/**
 * Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]. Необходимо написать программу,
которая выведет в консоль все чётные числа.*/

public class third {
    public static void main (String[] args) {

        int[] array = new int [11];

        for (int i = 1; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 1; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " | ");
            }
        }
    }
}
