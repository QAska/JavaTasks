/*
Написать метод (методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        int a, b, c;
        int nod1, nod2;

        a = getNumber();
        b = getNumber();
        c = getNumber();

        nod1 = getNod(a, b);
        nod2 = getNod(nod1, c);

        if (nod1 == 1 && nod2 == 1) {
            System.out.println("Coprime numbers.");
        } else {
            System.out.println("NOT comprime numbers.");
        }

    }

    public static int getNod(int a, int b) {
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
