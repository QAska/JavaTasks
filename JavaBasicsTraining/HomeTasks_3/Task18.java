/*
Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
(например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        int n;
        int topBorder;

        n = getNumber();
        topBorder = getTopBorder(n);

        for (int i = 1; i <= topBorder; i++) {
            if (ifIncreasingNumbers(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean ifIncreasingNumbers (int n) {
        int last, preLast;
        boolean ifIncreased;

        last = n % 10;
        n /= 10;
        preLast = n % 10;

        ifIncreased = false;
        while (n != 0) {
            if (last > preLast) {
                ifIncreased = true;
                last = preLast;
                preLast = n / 10 % 10;
                n /= 10;
            } else {
                ifIncreased = false;
                break;
            }
        }

        return ifIncreased;
    }

    public static int getTopBorder(int n) {
        int top;

        top = (int) Math.pow(10, n) - 1;

        return top;
    }

    public static int getNumber() {
        int z;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Only integers are allowed! Try again: ");
        }

        z = in.nextInt();

        return z;
    }
}
