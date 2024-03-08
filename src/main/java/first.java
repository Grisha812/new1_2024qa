import java.util.Scanner;

/**
 * Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие
     действия: - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль
     одного из вариантов:
"a > b", "a < b" или "a = b"; совершает с этими числами операции сложения, вычитания, деления и
умножения и результат выводит в консоль
 */
public class first {
    public static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {

        int a;
        int b;
        System.out.println("Введите a : ");
        a = scanner.nextInt();
        System.out.println("Введите b : ");
        b = scanner.nextInt();

        if (a > b) {
            System.out.println("Результат сравнения : a > b");
        } else if (a < b) {
            System.out.println("Результат сравнения : a < b");
        } else  {
            System.out.println("Результат сравнения : a = b");
        }

        int c0 = a + b;
        int c1 = a - b;
        int c2 = a * b;
        float c3 = (float) a / b;

        System.out.println(c0);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}

