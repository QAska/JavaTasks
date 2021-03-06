/*
Создать класс, который наследует Exception. Создать интерфейс с методом, который выкидывает это исключение.
Создать класс, который наследует интерфейс и реализует этот метод.
В методе по определённому условию брось это исключение.
В main-методе создай объект этого класса и вызови метод с исключением, оберни его в try-catch блок.
Создай класс наследованный от RuntimeException. Внутри catch-блока брось это исключение.
 */

public class Task07 {
    public static void main(String[] args){
        MyClassImplementsInterface myClass = new MyClassImplementsInterface();
        try {
            myClass.displayException();
        } catch (MyClassException e) {
            e.printStackTrace();
        }

        try {
            MyClassRuntimeException.throwException();
            throw new MyClassException("MyClassException message!");
        } catch (MyClassException e) {
            e.printStackTrace();
            System.out.println("RuntimeException error in main method!");
        }
    }
}
