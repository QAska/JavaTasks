/*
В main-методе создать несколько String-ов. Найти, начинается ли строка с определённой буквы.
Найти, содержит ли строка определённое слово.
 */

public class Task05 {
    public static void main(String[] args) {
        boolean result;
        String line;
        String word;
        char firstLetter;

        result = false;
        line = "Baaasearchaaa";
        firstLetter = 'B';
        word = "search";

        result = line.charAt(0) == firstLetter;

        System.out.println("String '" + line + "' starts from letter '" + firstLetter + "': " + result);

        result = line.contains(word);

        System.out.println("String '" + line + "' contains word '" + word + "': " + result);
    }
}
