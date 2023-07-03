import java.util.Scanner;

public class EmptyString {

    static String string;

    public static void main(String[] args){

        inputString();

    }
    public static void inputString(){
        try {
            processInput();
            System.out.println("Введённая строка: " + string);

        } catch (EmptyStringException e){
            System.out.println(e.getMessage());
        }
    }

    public static void processInput() throws EmptyStringException{
        Scanner n = new Scanner(System.in);
        System.out.print("Введите строку: ");
        string = n.nextLine();

        if (string.length() == 0){
            throw new EmptyStringException("Ввод пустой строки недопустим!");
        }
    }

}

class EmptyStringException extends Throwable {
    public EmptyStringException(String message) {
        super(message); }
}