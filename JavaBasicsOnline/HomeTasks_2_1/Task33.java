/*
Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в базе данных.
Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа.
Они имеют следующие пароли:
9583, 1747 — доступны модули баз А, В, С;
3331, 7922 — доступны модули баз В, С;
9455, 8997 — доступен модуль базы С.
 */

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        int pass1, pass2, pass3, pass4, pass5, pass6;
        int pass;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter password:");
        pass = in.nextInt();

        pass1 = 9583;
        pass2 = 1747;
        pass3 = 3331;
        pass4 = 7922;
        pass5 = 9455;
        pass6 = 8997;

        if (pass == pass5 || pass == pass6) {
            System.out.println("Access to C allowed.");
        }
        else if (pass == pass3 || pass == pass4) {
            System.out.println("Access to B and C allowed.");
        }
        else if (pass == pass1 || pass == pass2) {
            System.out.println("Access to A, B and C allowed.");
        }
        else {
            System.out.println("Access denied.");
        }
    }
}
