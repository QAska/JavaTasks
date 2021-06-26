/*
Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.
 */

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        double a;
        double s, sAll, v;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a:");
        a = in.nextDouble();

        s = Math.pow(a, 2);
        sAll = s * 6;
        v = Math.pow(a, 3);

        System.out.println("s = " + s + ", sAll = " + sAll + ", v = " + v);
    }
}
