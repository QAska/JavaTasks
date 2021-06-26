/*
Магическим квадратом порядка n называется квадратная матрица размера n x n,
составленная из чисел 1, 2, 3, ..., n^2 так, что суммы по каждому столбцу,
каждой строке и каждой из двух больших диагоналей равны между собой.
Построить такой квадрат. Пример магического квадрата порядка 3:
6 1 8
7 5 3
2 9 4
 */

import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {
        int n;
        int magic;
        int[][] array;

        n = getNumber();
        magic = (n * (n * n + 1)) / 2;
        System.out.println("Magic number = " + magic);

        array = new int[n][n];

        initOddMagicArray(array, n);


        printArray(array);

    }


    public static void initOddMagicArray(int[][] array, int n) {
        int posI;
        int posJ;
        int num;

        posI = 0;
        posJ = (array.length) / 2;
        num = 1;
        array[0][posJ] = num;

        while (num <= n * n - 1) {
            num++;

            posI -= 1;
            posJ += 1;

            if (posI == -1 && posJ == n) {
                posI += 2;
                posJ -= 1;
            } else if (posI == -1) {
                posI = n - 1;
            }

            if (posJ == n) {
                posJ = 0;
            }

            if (array[posI][posJ] != 0) {
                posI += 2;
                posJ -= 1;
            }

            array[posI][posJ] = num;
        }

    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static int getNumber() {
        int z;
        Scanner in;

        in = new Scanner(System.in);
        do {
            System.out.print("Enter array size, integer number > 2: ");
            while (!in.hasNextInt()) {
                in.next();
                System.out.print("Only integers are allowed! Try again: ");
            }

            z = in.nextInt();
        } while (z < 3);

        return z;
    }
}
