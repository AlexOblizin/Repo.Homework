import java.util.Scanner;

public class Confident {

    public static void main(String[] args) {

        String placeholderSafe = "***";

        String temp;
        System.out.println("\n*** ВВЕДИТЕ НОМЕР КРЕДИТКИ БЛОКАМИ ПО ЧЕТЫРЕ ЦИФРЫ ***\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первые 4 цифры номера кредитки: ");

        String n1 = scan.nextLine();
        while (!isRight(n1)){
            System.out.println("Некорректный ввод. Попробуйте еще раз!");
            System.out.print("Введите первые 4 цифры номера кредитки: ");
            n1 = scan.nextLine();
        }
        temp = "<" + n1 + " ";


        System.out.print("Введите вторые 4 цифры номера кредитки: ");
        String n2 = scan.nextLine();

        while (!isRight(n2)){
            System.out.println("Некорректный ввод. Попробуйте еще раз!");
            System.out.print("Введите вторые 4 цифры номера кредитки: ");
            n2 = scan.nextLine();
        }
        temp += n2 + " ";

        System.out.print("Введите третьи 4 цифры номера кредитки: ");
        String n3 = scan.nextLine();

        while (!isRight(n3)){
            System.out.println("Некорректный ввод. Попробуйте еще раз!");
            System.out.print("Введите третьи 4 цифры номера кредитки: ");
            n3 = scan.nextLine();
        }
        temp += n3 + ">";

        System.out.print("Введите последние 4 цифры номера кредитки: ");
        String n4 = scan.nextLine();

        while (!isRight(n4)){
            System.out.println("Некорректный ввод. Попробуйте еще раз!");
            System.out.print("Введите последние 4 цифры номера кредитки: ");
            n4 = scan.nextLine();
        }
        temp += " " + n4;
        String tempFull = "Номер кредитной карты " + temp;

        String text1 = tempFull;


        System.out.print("\n" + Confident.searchAndReplaceDiamonds(text1, placeholderSafe));
        System.out.println();

        System.out.print("\nБез применения метода searchAndReplaceDiamonds(String text, String placeholder) --- ");
        System.out.println(tempFull);

        System.out.println("\nС применением метода searchAndReplaceDiamonds(Номер <1211 2111 1212> 1212 кредитной карты, ***) - аргументы задали в скобках сами ");
        System.out.print("Результат от расположения скобок не зависит --- ");

        System.out.println(searchAndReplaceDiamonds("Номер <1211 2111 1212> 1212 кредитной карты", "***"));

    }
    static String searchAndReplaceDiamonds(String text, String placeholder){
        String needChange = text.substring(text.indexOf('<'),text.lastIndexOf('>') + 1);
        String safe = text.replace(needChange, placeholder);
        return safe;
    }
        static boolean isRight(String n){

        if (n.length() != 4 || !n.matches("^[0-9]+$")) {
            return false;
        }
        else{
            return true;
        }

    }

}
