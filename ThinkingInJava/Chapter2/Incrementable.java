/****************** Exercise 7 ******************
 * Turn the Incrementable code fragments into a working program.
 ************************************************/

class StaticTest{
    static int i = 47;
}

public class Incrementable {

    static void increment(){
        StaticTest.i++;
    }

    public static void main(String[] args) {
        Incrementable sf = new Incrementable();
        sf.increment();
        increment(); // эксперимент

        System.out.println(StaticTest.i);
    }
}
