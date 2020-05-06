/*
Создать новый класс, без полей и методов. Создать объект класса, и у него вызвать toString и hashCode.
Создать 2 экземпляра класса и сравнить их equals методом и ==, результат вывести в консоль. Добавить поле в класс,
реализовать в классе метод equals и после этого ещё раз проверить результат выполнения equals метода.
 */

public class Task04 {

    public static void main(String[] args) {
        Person a = new Person("Test1", 18);
        Person b = new Person("Test21", 18);

        System.out.println("toString() of a: " + a.toString());
        System.out.println("hashCode() of a: " + a.hashCode());

        System.out.println("toString() of b: " + b.toString());
        System.out.println("hashCode() of b: " + b.hashCode());

        System.out.println("Is a == b: " + (a == b));
        System.out.println("Is a equals b: " + a.equals(b));
    }
}
