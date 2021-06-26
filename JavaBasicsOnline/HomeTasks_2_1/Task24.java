/*
Составить программу, определяющую результат гадания на ромашке — «любит—не любит»,
взяв за исходное данное количество лепестков n.
 */

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество лепестков, n:");
        n = in.nextInt();

        if (n % 2 == 0) {
            System.out.println("Не любит :(");
        }
        else {
            System.out.println("Любит!");
        }
    }
}
