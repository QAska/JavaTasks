/****************** Exercise 1 *****************
 * Write a program that uses the "short" and
 * normal form of print statement.
 ***********************************************/

import java.io.PrintStream;
import java.util.Date;

public class PrintStatements {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Hello, today is " + currentDate);
        print("Hello, today is " + currentDate);
    }

    public static void print(Object obj) {
        System.out.println(obj);
    }
    // Print a newline by itself:
    public static void print() {
        System.out.println();
    }
    // Print with no line break:
    public static void printnb(Object obj) {
        System.out.print(obj);
    }
    // The new Java SE5 printf() (from C):
    public static PrintStream
    printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
