/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
* */
public class TwoArrays {

    static int[] diffArray;

    public static void main(String[] args) {
        int[] array1 = {2, 5, 7, 10, 15, 7};
        int[] array2 = {2, 5, 7, 10, 15, 1};


        toPrint(array1);
        toPrint(array2);
        System.out.println("----------------------");
        arrayDifference(array1, array2);
        toPrint(diffArray);
    }

    public static void arrayDifference(int[] array1, int[] array2){
        if(array1.length == array2.length){
            diffArray = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
               diffArray[i] = array1[i] - array2[i];
            }
        } else {
            System.out.println("Массивы имеют разную длину.");

        }
    }

    public static void toPrint(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t",array[i]);

        }
        System.out.println();
    }
}
