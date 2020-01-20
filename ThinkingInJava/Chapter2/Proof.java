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
