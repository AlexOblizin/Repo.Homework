import java.util.Scanner;

public class LastFirstMiddleName {
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

            System.out.println("Вы ввели ФИО: " + lFMName);
            int s = lFMName.indexOf(' ');
            String surName = lFMName.substring(0, s);
            int m = lFMName.lastIndexOf(' ');
            String middleName = lFMName.substring(m + 1);
            int a = lFMName.trim().length() - surName.length() - middleName.length();
            int a1 = surName.length();
            String name = lFMName.substring(a1 + 1, a1 + a);
            System.out.println("Имя: " + name);
            System.out.println("Отчество: " + middleName);
            System.out.println("Фамилия: " + surName);
    }

    static boolean isCorrect(String str){
        if (str.matches("^[А-ЯЁ][а-яё]*([-][А-ЯЁ][а-яё]*)?\\s[А-ЯЁ][а-яё]*\\s[А-ЯЁ][а-яё]*$")) {
            return true;
        }
        return false;

    }
}
