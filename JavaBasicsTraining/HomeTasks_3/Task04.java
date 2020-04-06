/*
Написать метод (методы) для нахождения наименьшего общего кратного трех натуральных чисел.
 */

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        int a, b, c;
        int nok1, nok2;

        a = enterValue();
        b = enterValue();
        c = enterValue();

        nok1 = calcNok(a, b);
        nok2 = calcNok(nok1, c);

        System.out.println(nok2);
    }

    public static int calcNok(int a, int b) {
        int nok;

        if (a > b) {
            nok = a;
        } else {
            nok = b;
        }

        while (!((nok % a == 0) && (nok % b ==0))) {
            nok++;
        }

        return nok;
    }

    public static int enterValue() {
        int z;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Only integers are possible! Try again: ");
        }

        z = in.nextInt();

        return z;
    }
}
