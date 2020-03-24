/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        int t;
        int h;
        int m;
        int s;
        int secInDay = 60 * 60;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter T:");
        t = in.nextInt();

        h = t / secInDay;
        m = t % secInDay / 60;
        s = t % 60;

        String strH = String.format("%02d", h);
        String strM = String.format("%02d", m);
        String strS = String.format("%02d", s);

        System.out.println("Initial amount of seconds: " + t);
        System.out.println(strH + "ч " + strM + "м " + strS + "c");
    }
}
