/*
Создать новый класс, без полей и методов. Вызвать метод toString, hashCode.
Создать 2 экземпляра класса и сравнить их equals методом и ==, результат вывести в консоль.
Реализовать в классе метод equals и после этого ещё раз проверить результат выполнения equals метода.
 */

public class Task04 {

    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();

        System.out.println("toString() of a: " + a.toString());
        System.out.println("hashCode() of a: " + a.hashCode());

        System.out.println("toString() of b: " + b.toString());
        System.out.println("hashCode() of b: " + b.hashCode());

        System.out.println("Is a == b: " + (a == b));
        System.out.println("Is a equals b: " + a.equals(b));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}


