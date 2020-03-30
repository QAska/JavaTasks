/*
Составить программу сравнения введенного числа а и цифры 3.
Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».
 */

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        double a;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();

        if (a < 3) {
            System.out.println("yes");
        }
        else if (a > 3) {
            System.out.println("no");
        }
        else {
            System.out.println("a is equal 3");
        }
    }
}
