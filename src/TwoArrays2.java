/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
* */
public class TwoArrays2 {
    static int[] quotientArray;

    public static void main(String[] args) {
        int[] array1 = {2, 5, 7, 10, 15, 0};
        int[] array2 = {2, 5, 7, 10, 0, 1};


        toPrint(array1);
        toPrint(array2);
        System.out.println("----------------------");
        arrayDivided(array1, array2);
        toPrint(quotientArray);
    }

    public static void arrayDivided(int[] array1, int[] array2){
        if(array1.length == array2.length){
            quotientArray = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                if(array2[i] == 0){
                    throw new RuntimeException("Деление на 0 недопустимо!");
                }
                quotientArray[i] = array1[i] / array2[i];
            }
        } else {
            throw new RuntimeException("Массивы имеют разную длину.");

        }
    }

    public static void toPrint(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t",array[i]);

        }
        System.out.println();
    }
}
