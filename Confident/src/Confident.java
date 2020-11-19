import java.util.Scanner;

public class Confident {

    public static void main(String[] args) {

        String placeholderSafe = "***";
//        String safe;

        String temp = null;
        System.out.print("Введите номер кредитки\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первые 4 цифры: ");
        String n1 = scan.nextLine();
        if (isRight(n1)) temp = n1 + " ";
        else {
            System.out.println("Некорректный ввод. Попробуйте еще раз!");
            System.out.print("Введите первые 4 цифры: ");
            n1 = scan.nextLine();

        }
        System.out.print("Введите вторые 4 цифры: ");
        String n2 = scan.nextLine();
        if (isRight(n1)) temp += n2 + " ";
        else {
            System.out.println("Некорректный ввод. Попробуйте еще раз!");
            System.out.print("Введите вторые 4 цифры: ");
            n2 = scan.nextLine();

        }
        System.out.print("Введите третьи 4 цифры: ");
        String n3 = scan.nextLine();
        if (isRight(n1)) temp += n3 + " ";
        else {
            System.out.println("Некорректный ввод. Попробуйте еще раз!");
            System.out.print("Введите третьи 4 цифры: ");
            n1 = scan.nextLine();

        }
        System.out.print("Введите последние 4 цифры: ");
        String n4 = scan.nextLine();
        if (isRight(n1)) temp += n4 + ">";
        else {
            System.out.println("Некорректный ввод. Попробуйте еще раз!");
            System.out.print("Введите последние 4 цифры: ");
            n1 = scan.nextLine();

        }

        System.out.println(temp);
        String text1 = temp;
        Confident.searchAndReplaceDiamonds(text1, placeholderSafe);

    }
    static String searchAndReplaceDiamonds(String text, String placeholder){
        String textFin = "Номер кредитной карты <" + text + ">";
        System.out.println(textFin);

        String newText = textFin.substring(textFin.indexOf('<')+1,textFin.lastIndexOf('>'));
        newText = placeholder;

        return textFin + newText;
    }
    static boolean isRight(String n){

        if (n.length() > 0 && n.length() <= 4) return true;
        else return false;
    }

}
