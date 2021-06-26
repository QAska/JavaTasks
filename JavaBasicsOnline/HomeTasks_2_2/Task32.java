/*
Проверить введенную пользователем строку на наличие недопустимых символов.
В качестве первого символа допустимы только буквы и знак подчеркивания.
Остальные символы могут быть буквами, цифрами и знаком подчеркивания.
 */

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        String line;
        String firstChar;
        String nextChar;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter string line:");
        line = in.nextLine();

        firstChar = line.substring(0, 1);
        if (!firstChar.matches("[a-zA-Z_]")) {
            System.out.println("First symbol is incorrect: " + firstChar);
        }
        else {
            for (int i = 1; i < line.length(); i++) {
                nextChar = line.substring(i, i + 1);
                if (!nextChar.matches("[a-zA-Z0-9_]")) {
                    System.out.print("Incorrect symbol in the text: " + nextChar);
                    break;
                }
            }
        }
    }
}
