/****************** Exercise 1 *****************
 * Create a class containing an int and a char
 * that are not initialized. Print their values
 * to verify that Java performs default
 * initialization.
 ***********************************************/

public class IntChar {
    public static void main(String[] args) {
        class Data{
            int i;
            char ch;
        }

        Data d = new Data();

        System.out.println("Default int value is " + d.i);
        System.out.println("Default char value is " + d.ch);
    }
}
