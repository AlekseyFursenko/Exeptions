import java.util.Scanner;

public class FloatInput {
    static float number;

    public static void main(String[] args) {
        floatInput();
        System.out.println("Введённое число: " + number);
    }

    public static void floatInput() throws RuntimeException{
        while (processInput() == false){
            processInput();
        }
    }
    public static boolean processInput() throws RuntimeException {
        try {
            System.out.print("Введите вещественное число: ");
            Scanner n = new Scanner(System.in);
            number = n.nextFloat();
            return true;
        } catch (RuntimeException e) {
            System.out.println("Неверный формат числа!");
            return false;
        }
    }
}
