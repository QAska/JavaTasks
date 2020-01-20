/****************** Exercise 8 ******************
 * Write a program to demonstrate that no matter how many objects you create of a
 * particular class, there is only one instance of a particular static field in that class.
 ************************************************/

public class Proof {
    static int i = 47;

    public static void main(String[] args) {
        Proof st1 = new Proof();
        Proof st2 = new Proof();
        System.out.println(st1.i + " (st1) == " + st2.i + " (st2)");
        st1.i++;
        System.out.println(st1.i + " (st1) == " + st2.i + " (st2)");
    }
}
