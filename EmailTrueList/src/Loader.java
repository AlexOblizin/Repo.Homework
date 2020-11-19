import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {
    static String addET;
    static boolean isQuit = false;
    static String temp;

    public static void main(String[] args) {

        HashSet<String> emailTrueList = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        while (isQuit == false) {

            System.out.println("\n(add) Внести e-mail;\n(list) Список e-mail адресов;\n(exit) Выйти из программы");
            System.out.print("\nЧто вы выбираете: ");

            temp = scanner.nextLine();

            System.out.println();

            switch (temp) {

                case "add":

                    System.out.print("Введите адрес электронной почты: ");
                    temp = scanner.nextLine();

                    if (validate(temp)) {
                        System.out.println("\n\tE-mail is correct!");
                        addET = temp;
                    }
                    else System.out.println("\n\tE-mail not validated!");

                    emailTrueList.add(addET);
                    break;

                case "list":
                    emailTrueList.forEach((n) -> System.out.println(n)); //использую лямбда-выражение
                    break;

                case "exit":
                    isQuit = true;
                    break;

                default:
                    System.out.println("Неверно! Введите add, list или exit!");
            }
        }
    }

       static boolean validate(final String hex) {

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                                          "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(hex);

        return matcher.matches();
       }

   }
