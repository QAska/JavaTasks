import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

/*
В main-методе создать переменные для каждого типа данных.
Создать переменные примитивных классов и перевести эти переменные в классы обёртки(из int в Integer и наоборот).
Создать массив строк, наполнить его, вывести в консоль его длину и все элементы.
 */
public class Main {
    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 2147483648L;

        double d = 1.1;
        float f = 1.1f;

        char ch = 'a';
        boolean bool = false;

        String line = "Hello!";

        Byte b1 = b;
        Short s1 = s;
        Integer i1 = i;
        Long l1 = l;

        Double d1 = d;
        Float f1 = f;

        Character ch1 = ch;
        Boolean bool1 = bool;

        byte b2 = b1;
        short s2 = s1;
        int i2 = i1;
        long l2 = l1;

        double d2 = d1;
        float f2 = f1;

        char ch2 = ch1;
        boolean bool2 = bool1;

        // work with array
        int n;
        String[] array;
        int size;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size, integer number: ");
        while (!in.hasNextInt()) {
            in.next();
            System.out.print("Only integers are allowed! Try again: ");
        }

        n = in.nextInt();
        in.nextLine();
        array = new String[n];

        for (int k = 0; k < array.length; k++) {

            System.out.print("Enter string: ");
            array[k] = in.nextLine();
        }

        size = array.length;

        System.out.println("Array size is " + size + ":");

        for (int p = 0; p < array.length; p++) {
            System.out.println(array[p]);
        }
    }
}
