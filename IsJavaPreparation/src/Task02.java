/*
Выбрать объект в помещении и создать класс с его именем. Добавить несколько конструкторов.
Наполнить класс полями и методами, которые описывают его свойства и поведение. Для полей добавить getter-ы, setter-ы.
Создать другой класс с main методом и в нём создать объект этого типа, заполнить поля, вызвать методы объекта.
Добавить в класс static метод и вызвать его в main-методе используя имя класса.
 */

public class Task02 {
    public static void main(String[] args) {
        Phone myPhone1;
        String myPhone1Model;
        int myPhone1Ram;

        myPhone1 = new Phone("Samsung", 2048, 6.4);
        myPhone1Model = myPhone1.getModel();
        myPhone1Ram = myPhone1.getRam();

        myPhone1.phoneDescription(myPhone1Model, myPhone1Ram);

        System.out.println("I have bought a new phone!");
        myPhone1.setModel("Xiaomi Note 9S");
        myPhone1.setRam(4096);
        myPhone1.setDiagonal(6.67);

        myPhone1.phoneDescription(myPhone1.getModel(), myPhone1.getRam(), myPhone1.getDiagonal());
        myPhone1.phoneRings();
        myPhone1.phoneCalls();

        Phone.alarmRings();
    }
}
