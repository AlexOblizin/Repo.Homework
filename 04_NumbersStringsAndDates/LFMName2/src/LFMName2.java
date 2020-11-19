import java.util.Scanner;

public class LFMName2 {
    public static void main(String[] args) {
        String lFMName;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите Ф.И.О человека: ");
        lFMName = scan.nextLine();
        while (!isCorrect(lFMName)) {
            System.out.println("Некорректный ввод!");
            System.out.print("Введите Ф.И.О человека: ");
            lFMName = scan.nextLine();
        }
        String[] nms2 = lFMName.split("\\s");
        String surname = "Фамилия: " + nms2[0];
        System.out.println(surname);
        String name = "Имя: " + nms2[1];
        System.out.println(name);
        String middle = "Отчество: " + nms2[2];
        System.out.println(middle);
    }
        static boolean isCorrect(String str){
            return str.matches("^[А-ЯЁ][а-яё]*([-][А-ЯЁ][а-яё]*)?\\s[А-ЯЁ][а-яё]*\\s[А-ЯЁ][а-яё]*$");
        }
    }
