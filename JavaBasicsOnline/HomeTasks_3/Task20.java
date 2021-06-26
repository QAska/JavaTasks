/*
Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        int n;
        int count;

        n = getNumber();
        count = 0;
        while (n > 0) {
            n = n - getSumOfDigits(n);
            count++;
        }

        System.out.println(count);
    }


    public static int getSumOfDigits(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static int getNumber() {
        int z;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.print("Only integers are available! Try again: ");
        }

        z = in.nextInt();

        return z;
    }
}
