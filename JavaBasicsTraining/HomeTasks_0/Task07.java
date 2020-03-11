/*
Программа вводит два числа a и b, если a > b, то программа вводит третье число c и находит сумму b + c.
Если a = b, то программа печатает слово «Конец».
Если a < b, то программа вводит третье число c, находит сумму a + b + c,
выводит на экран сумму a + b + c и слова «Новый 2020 год!».
*/

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        String text = "Новый 2020 год!";
        double res;

        if (a > b) {
            System.out.print("Enter c: ");
            double c = scanner.nextDouble();
            res = b + c;
            System.out.println(res);
        }
        else if (a < b) {
            System.out.print("Enter c: ");
            double c = scanner.nextDouble();
            res = a + b + c;
            System.out.println(res + " " + text);
        }
        else {
            System.out.println("Конец.");
        }
    }
}
