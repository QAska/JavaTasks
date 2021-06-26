/*
Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их угадать.
Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа,
а также ошибочные числа пользователя.
 */

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        int a;
        int z;

        int min = 1;
        int max = 15;

        for (int i = 0; i < 5; i++) {
            a = (int) (Math.random() * (max - min)) + 1;

            Scanner in = new Scanner(System.in);
            System.out.println("Guess the number:");
            z = in.nextInt();
            if (a == z) {
                System.out.println("Great! Guessed number: " + a + ". Your answer: " + z + ".");
            }
            else {
                System.out.println("Guessed number: " + a + ". Your answer: " + z + ". Try again!");
            }
        }
    }
}
