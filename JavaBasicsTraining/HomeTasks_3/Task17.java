/*
Натуральное число, в записи которого n цифр, называется числом Армстронга,
если сумма его цифр, возведенная в степень n, равна самому числу.
Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int k;
        String message;

        message = "Enter number k (top border): ";
        k = getNumber(message);

        System.out.println("Armstrong numbers from 1 to " + k + ":");
        printResult(k);

    }

    public static void printResult(int k) {
        for (int i = 1; i <= k; i++) {
            if (checkIfArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean checkIfArmstrong(int n) {
        int sum;
        int count;
        int tmp;
        boolean ifArmstrong;

        count = getDigitsNumber(n);

        sum = 0;
        tmp = n;
        while (tmp != 0) {
            sum = sum + (int) Math.pow(tmp % 10, count);
            tmp /= 10;
        }

        ifArmstrong = false;
        if (sum == n) {
            ifArmstrong = true;
        }

        return ifArmstrong;
    }

    public static int getDigitsNumber(int n) {
        int count;

        count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int getNumber(String message) {
        int z;

        Scanner in = new Scanner(System.in);
        System.out.println(message);
        while (!in.hasNextInt()) {
            in.next();
            System.out.print("Only integers are available! Try again: ");
        }

        z = in.nextInt();

        return z;
    }
}
