/****************** Exercise 2 *****************
 * Create a class containing a float and use it
 * to demonstrate aliasing.
 ***********************************************/

class Name {
    float f;
}

public class Aliasing {
    public static void main(String[] args) {
        Name n1 = new Name();
        Name n2 = new Name();
        n1.f = 9f;
        n2.f = 47f;
        System.out.println("1: n1.f = " + n1.f + ", n2.f = " + n2.f);
        n1 = n2; // both point to the same object n2
        System.out.println("2: n1.f = " + n1.f + ", n2.f = " + n2.f);
        n1.f = 27f;
        System.out.println("3: n1.f = " + n1.f + ", n2.f = " + n2.f);
    }
}
