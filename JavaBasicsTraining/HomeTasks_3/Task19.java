/*
Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        int n;
        int sumOfOdds, countOfEven;

        n = getNumber();

        sumOfOdds = getSum(n);
        countOfEven = getSumOfEvenDigits(sumOfOdds);

        System.out.println("Sum of numbers above is "  + sumOfOdds + ".");
        System.out.println("Amount of even digits in " + sumOfOdds + " is " + countOfEven + ".");
    }

    public static int getSum(int n) {
        int sum = 0;
        int topBorder = getTopBorder(n);

        for (int i = 1; i <= topBorder; i++) {
            if (checkIfOddsOnlyConsistingNumber(i)) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println();

        return sum;
    }

    public static boolean checkIfOddsOnlyConsistingNumber (int n) {
        int lastDigit;
        boolean isOddConsistingNumber;

        lastDigit = getLastDigit(n);

        isOddConsistingNumber = false;
        while (n != 0) {
            if (lastDigit % 2 != 0) {
                isOddConsistingNumber = true;
                n /= 10;
                lastDigit = getLastDigit(n);
            } else {
                isOddConsistingNumber = false;
                break;
            }
        }

        return isOddConsistingNumber;
    }

    public static int getSumOfEvenDigits(int n) {
        int count = 0;
        int digit;
        while (n != 0) {
            digit = getLastDigit(n);
            if (digit % 2 == 0) {
                count++;
            }
            n /= 10;
        }

        return count;
    }

    public static int getLastDigit(int n) {
        return n % 10;
    }

    public static int getTopBorder(int n) {
        return (int) Math.pow(10, n) - 1;
    }

    public static int getNumber() {
        int z;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.print("Only integers are allowed! Try again: ");
        }

        z = in.nextInt();

        return z;
    }
}
