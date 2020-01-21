/****************** Exercise 3 *****************
 * Create a class containing a float and use it
 * to demonstrate aliasing during method calls.
 ***********************************************/

class ThingFloat {
    float f;
}

public class AliasingCall {
    static void action(ThingFloat a) {
        a.f = 12f;
    }

    public static void main(String[] args) {
        ThingFloat tf = new ThingFloat();
        tf.f = 1f;
        System.out.println("1: f = " + tf.f);
        action(tf);
        System.out.println("2: f = " + tf.f);
    }
}
