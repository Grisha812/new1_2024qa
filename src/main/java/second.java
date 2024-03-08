import java.util.Scanner;

/**
 * Написать программу, которая принимает на вход две строки (a и b) и сравнивает их. В результате
сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"
 */

public class second {
    public static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {

        String a;
        String b;

        System.out.println("Введите первую строку:");
        a = scanner.next();
        System.out.println("Введите вторую строку:");
        b = scanner.next();

    if (a.equals (b)) {
        System.out.println("Строки идентичны");
    } else
        System.out.println("Строки неидентичны");
    }
}

