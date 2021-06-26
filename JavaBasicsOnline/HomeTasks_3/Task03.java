/*
Написать метод (методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        int a, b, c, d;
        int nod1, nod2, nod3;

        a = enterValue();
        b = enterValue();
        c = enterValue();
        d = enterValue();

        nod1 = findNod(a, b);
        nod2 = findNod(c, d);
        nod3 = findNod(nod1, nod2);

        System.out.println(nod3);
    }

    public static int findNod(int a, int b) {
        int nod;

        if (a > b) {
            nod = b;
        } else {
            nod = a;
        }

        while (!(a % nod == 0 && b % nod == 0)) {
            nod--;
        }

        return nod;
    }

    public static int enterValue() {
        int z;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer value: ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Only integers are possible! Try again: ");
        }

        z = in.nextInt();

        return z;
    }
}
