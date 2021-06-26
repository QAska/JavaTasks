/*
Написать метод (методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:
НОК(А, В) = А * В / НОД(А, В).
 */

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int a, b;
        int nod, nok;
        String message;

        message = "Enter integer a: ";
        a = enterValue(message);
        message = "Enter integer b: ";
        b = enterValue(message);

        nod = nodCalc(a, b);
        nok = nokCalc(a, b);

        System.out.println("Greatest common divisor is " + nod + ".");
        System.out.println("Least common multiple is " + nok + ".");

    }

    public static int nokCalc(int a, int b) {
        int nok;

        if (a > b) {
            nok = a;
        } else {
            nok = b;
        }

        while (!((nok % a == 0) && (nok % b == 0))) {
            nok++;
        }

        return nok;
    }

    public static int nodCalc(int a, int b) {
        int nod;

        if (a > b) {
            nod = b;
        } else {
            nod = a;
        }

        while (!((a % nod == 0) && (b % nod == 0))) {
            nod--;
        }

        return nod;
    }

    public static int enterValue(String message) {
        int z;

        Scanner in = new Scanner(System.in);
        System.out.println(message);
        while (!in.hasNextInt()) {
            in.next();
            System.out.print("Only integers are possible! Try again: ");
        }

        z = in.nextInt();

        return z;
    }
}
