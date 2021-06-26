/*
Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12).
Если введены некорректные данные, то сообщить об этом.
 */

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        int day;
        int month;
        int year;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter day:");
        day = in.nextInt();
        System.out.println("Enter month:");
        month = in.nextInt();
        System.out.println("Enter year:");
        year = in.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day > 0 && day <=31) {
                    System.out.println("Дата введена верно.");
                }
                else {
                    System.out.println("Дата введена не верно!");
                }
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    if (day > 0 && day <= 29) {
                        System.out.println("Дата введена верно.");
                    }
                    else {
                        System.out.println("Дата введена не верно!");
                    }
                }
                else {
                    if (day > 0 && day <= 28) {
                        System.out.println("Дата введена верно.");
                    }
                    else {
                        System.out.println("Дата введена не верно!");
                    }
                }
                break;
            default:
                System.out.println("Дата не верна.");

        }
    }
}
