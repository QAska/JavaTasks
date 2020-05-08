/*
Создать класс, который наследует Exception. Создать интерфейс с методом, который выкидывает это исключение.
Создать класс, которые наследует интерфейс и реализует этот метод.
В методе по определённому условию брось это исключение.
В main-методе создай объект этого класса и вызови метод с исключением, оберни его в try-catch блок.
Создай класс насленованный от RuntimeException. Внутри catch-блока брось это исключение.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task07 {
    public static void printFirstString(String filePath) throws IOException, FileNotFoundException{
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Username\\Desktop\\test.txt"));
            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException e){
            System.out.println("Not found!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Input/Output error!");
            e.printStackTrace();
        }

    }
}
