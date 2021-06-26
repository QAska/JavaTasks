/*
Вычислить число и месяц в невисокосном году по номеру дня.
 */

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        int day;
        int count;
        int month;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of a day in a year:");
        day = in.nextInt();

        count = 0;
        while (day > 31) {
            count++;
            switch (count) {
                case 0:
                case 2:
                case 4:
                case 6:
                case 7:
                case 9:
                case 11:
                    day -= 31;
                    break;
                case 1:
                    day -= 28;
                    break;
                case 3:
                case 5:
                case 8:
                case 10:
                    day -=30;
                    break;
            }
        }

        month = count + 1;
        System.out.println(day + "." + month);

    }
}
