/*
Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч,
скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч.
 */

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        double v, v1;
        double t1, t2;
        double resLake, resRiverBack, resTotal;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter v:");
        v = in.nextDouble();
        System.out.println("Enter v1:");
        v1 = in.nextDouble();
        System.out.println("Enter t1:");
        t1 = in.nextDouble();
        System.out.println("Enter t2:");
        t2 = in.nextDouble();

        resLake = v * t1;
        resRiverBack = (v - v1) * t2;
        resTotal = resLake + resRiverBack;

        System.out.println("Distance on the lake = " + resLake);
        System.out.println("Distance on the river (against the river) = " + resRiverBack);
        System.out.println("Total distance = " + resTotal);
    }

}
