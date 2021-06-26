/*
Написать код для решения задачи. В n малых бидонах 80 л молока.
Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
 */

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        int n;
        int m;
        float volumeN;
        float volumeM;
        float totalM;
        float totalN = 80;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        n = in.nextInt();
        System.out.println("Enter m:");
        m = in.nextInt();

        volumeN = totalN / n;
        volumeM = volumeN + 12;
        totalM = volumeM * m;

        System.out.println("Big volume = " + volumeM);
        System.out.println("Total big volume = " + totalM);
    }
}
