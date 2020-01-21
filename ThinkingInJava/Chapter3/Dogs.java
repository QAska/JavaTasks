/****************** Exercise 5 *****************
 * Create a class called Dog with two Strings: name and says.
 * In main(), create two dogs, "spot" who says, "Ruff!", and "scruffy" who
 * says, "Wurf!". Then display their names and what they say.
 ***********************************************/

class Dog {
    String name;
    String says;
}
public class Dogs {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "Spot";
        dog2.name = "Scruffy";
        dog1.says = "Ruff!";
        dog2.says = "Wurf!";

        System.out.println(dog1.name + " says " + dog1.says);
        System.out.println(dog2.name + " says " + dog2.says);
    }
}
