import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {
    private final static String COMMAND_LIST = "list";
    private final static String COMMAND_EXIT = "exit";
    private static String name;
    private static String phone;

    public static void main(String[] args) {


        Map<String, String> account = new TreeMap<>();
        System.out.println("Введите Ф.И.О или номер телефона");

        while (true) {

            String userInput = UserInput.getLine();

            if (AddAndVerify.namePattern(userInput)) {
                name = userInput;
                System.out.println("Вы ввели имя.");
                if (account.containsKey(name)) {
                    System.out.println("У абонента - " + name + " телефон: " + account.get(name)
                            .replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "$1 ($2) $3-$4-$5"));
                } else {
                    System.out.println("Введите номер телефона.");
                    phone = UserInput.getLine()
                            .replaceFirst("\\+?\\d", "7")
                            .replaceAll("[^0-9]", "").trim()
                            .replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+$1$2$3$4$5");
                    if (AddAndVerify.phonePattern(phone)) {
                        System.out.println("Вы ввели номер телефона.");
                        account.put(name, phone);
                    } else {
                        System.out.println("Неверный ввод!");
                    }
                }
                continue;
            } else if (AddAndVerify.phonePattern(userInput)) {
                phone = userInput
                        .replaceFirst("\\+?\\d", "7")
                        .replaceAll("[^0-9]", "").trim()
                        .replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+$1$2$3$4$5");
                System.out.println("Вы ввели номер телефона.");
                if (account.containsValue(phone)) {
                    for (Map.Entry<String, String> entry : account.entrySet()) {
                        if (entry.getValue().equals(phone)) {
                            System.out.println("Телефон - " + phone
                                    .replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})",
                                    "$1 ($2) $3-$4-$5") + " принадлежит абоненту: " + entry.getKey());
                        }
                    }
                } else {
                    System.out.println("Введите имя: ");
                    name = UserInput.getLine();
                    if (AddAndVerify.namePattern(name)) {
                        System.out.println("Вы ввели имя.");
                        account.put(name, phone);
                    } else {
                        System.out.println("Неверный ввод!");
                    }
                }
                continue;
            }

            if (userInput.equals(COMMAND_LIST)) {
                System.out.println("\t\tСписок абонентов: ");
                account.forEach((a, b) -> System.out.println(a + ": " +
                        b.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "$1 ($2) $3-$4-$5")));

            } else if (userInput.equals(COMMAND_EXIT)) {

                break;

            } else {

                System.out.println("неверная команда!");

            }
        }
    }
}

class UserInput {

    public static String getLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ваши действия: ");
        return scanner.nextLine();
    }
}

class AddAndVerify {

    static boolean namePattern(final String hex) {
        Matcher matcherN = Pattern.compile("[А-ЯЁ][а-яё]*" +
                "([-][А-ЯЁ][а-яё]*)?\\s" +
                "[А-ЯЁ][а-яё]*\\s" +
                "[А-ЯЁ][а-яё]*").matcher(hex);
        return matcherN.matches();

    }

    static boolean phonePattern(final String hex) {

        Matcher matcherPh = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")
                .matcher(hex);

        return matcherPh.matches();
    }
}
