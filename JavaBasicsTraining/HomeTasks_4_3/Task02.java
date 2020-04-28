/*
Даны две последовательности a1 <= a2 <= a3 ... <= an и b1 <= b2 <= b3 ... <= bm. Образовать из них
новую последовательность чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */

public class Task02 {
    public static void main(String[] args) {
        int[] array1 = {1, 2};
        int[] array2 = {-11, 80, 90, 100, 150};

        int i = 0;
        int j = 0;
        while (i <= array1.length && j <= array2.length) {
            if (i < array1.length && j < array2.length ) {
                if (array1[i] < array2[j]) {
                    System.out.print(array1[i] + " ");
                    i++;
                } else {
                    System.out.print(array2[j] + " ");
                    j++;
                }
            } else if (i == array1.length && j < array2.length) {
                System.out.print(array2[j] + " ");
                j++;
            } else if (i < array1.length){
                System.out.print(array1[i] + " ");
                i++;
            } else {
                break;
            }
        }
    }
}
