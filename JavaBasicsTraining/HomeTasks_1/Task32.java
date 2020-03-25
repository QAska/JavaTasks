/*
Текущее показание электронных часов: h ч (0 ≤ h ≤23) m мин (0 ≤ m ≤59) s с (0 ≤ s ≤59).
Какое время будут показывать часы через р ч q мин r с?
 */

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        int h, m, s;
        int p, q, r;
        int tempH, tempM;
        int hh, mm, ss;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter h:");
        h = in.nextInt();
        System.out.println("Enter m:");
        m = in.nextInt();
        System.out.println("Enter s:");
        s = in.nextInt();

        System.out.println("Enter p:");
        p = in.nextInt();
        System.out.println("Enter q:");
        q = in.nextInt();
        System.out.println("Enter r:");
        r = in.nextInt();

        tempH = 0;
        tempM = 0;

        if ((s + r) > 60) {
            ss = (s + r) % 60;
            tempM += ((s + r) / 60);
        }
        else {
            ss = (s + r) % 60;
        }

        if ((m + q + tempM) > 60) {
            mm = (m + q + tempM) % 60;
            tempH += ((q + m) / 60);
        }
        else {
            mm = (m + q + tempM) % 60;
        }

        hh = (h + p + tempH) % 24;
        System.out.println("New time is: " + hh + "hh " + mm + "mm " + ss + "ss");
    }
}
