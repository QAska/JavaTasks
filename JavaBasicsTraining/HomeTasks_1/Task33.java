/*
Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.
 */

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        char symbol, previous, next;
        int index;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter symbol:");
        symbol = in.next().charAt(0);

        index = symbol; // в int приводить не нужно, т.к. char и так хранит числовой код символа
        previous = (char)(index - 1);
        next = (char)(index + 1);

        System.out.println("Your symbol has number: " + index + ". Previous symbol: " + previous + ", next: " + next);
    }
}
