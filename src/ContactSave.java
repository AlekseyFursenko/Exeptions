import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ContactSave {

    static String contact;
    static int contactLength = 4;

    public static void main(String[] args){
        processContact();
    }
    public static void processContact(){
        try {
            System.out.println("Новый контакт сохранен в файл " + parseLine(inputContact()));
        }catch (WrongContactData e){
            System.out.println(e.getMessage());
        }
    }

    //запрос ввода
    public static String inputContact(){
        Scanner n = new Scanner(System.in);
        System.out.println("Введите контакт в формате Фамилия Имя Отчество номер_телефона,\n" +
                            "ввод всех элементов через пробел, номер телефона целое беззнаковое число: ");
        String line = n.nextLine();

        return line;
    }
    //проверка контакта
    public static String parseLine(String line) throws WrongContactData{
        String delims = "[ ]+";
        String[] parsedLine = line.split(delims);

        if(parsedLine.length > contactLength){
            throw new WrongContactData("Введеные данные для контакта больше чем " + contactLength);
        }
        if(parsedLine.length < contactLength){
            throw new WrongContactData("Введеные данные для контакта меньше чем " + contactLength);
        }
        if(!isDigit(parsedLine[3])){
            throw new WrongContactData("Неверный формат ввода номера телефона.");
        }

        contact = line;
        saveTo(parsedLine[0]);
        return parsedLine[0];
    }
    public static boolean isDigit(String phone){
        try {
            Long.parseLong(phone);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    //запись контакта
    public static void saveTo(String fileName){

        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(contact);
            writer.write("\n");
            writer.close();
        } catch (IOException e){
            System.out.println("Ошибка записи в файл");
        }

    }

    //класс ошибок
}

class WrongContactData extends Exception{
    public WrongContactData(String message) {super(message);}
}