package net.tasks.Javarush;

/*
The sum of 10 numbers
Write a program that displays the sum of numbers from 1 to 10 by lines:
1
1+2=3
1+2+3=6
1+2+3+4=10
 */

public class SumOf10 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i <= 10; i++ )
        {
            n = n + i;
            System.out.println(n);
        }
    }
}