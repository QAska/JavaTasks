/*
Написать программу, переводящую римские цифры в арабские.
 */

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        char roman;
        int arabic = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter roman numeral:");
        roman = in.next().charAt(0);

        switch (roman) {
            case 'I':
                arabic = 1;
                break;
            case 'V':
                arabic = 5;
                break;
            case 'X':
                arabic = 10;
                break;
            case 'L':
                arabic = 50;
                break;
            case 'C':
                arabic = 100;
                break;
            case 'D':
                arabic = 500;
                break;
            case 'M':
                arabic = 1000;
                break;
            default:
                arabic = 0;
        }

        if (arabic == 0) {
            System.out.println("There is no this digit among roman numerals.");
        }
        else {
            System.out.println("Roman " + roman + " = arabic " + arabic + ".");
        }
    }
}
