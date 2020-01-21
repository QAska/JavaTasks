/****************** Exercise 6 *****************
 * Following Exercise 5 assign, a new Dog reference to spot's object.
 * Test for comparison using == and equals() for all references.
 ***********************************************/

class DogStore {
    String name;
    String says;
}
public class DogsComparison {
    public static void main(String[] args) {
        DogStore dog1 = new DogStore();
        DogStore dog2 = new DogStore();
        DogStore dog3 = dog1;

        dog1.name = "Spot";
        dog2.name = "Scruffy";
        dog1.says = "Ruff!";
        dog2.says = "Wurf!";

        System.out.println(dog3.name == dog1.name);
        System.out.println(dog3.name.equals(dog1.name));
        System.out.println(dog3.says == dog1.says);
        System.out.println(dog3.says.equals(dog1.says));
        System.out.println(dog3 == dog1);
        System.out.println(dog3.equals(dog1));
    }
}