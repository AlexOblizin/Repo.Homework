import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {
    private final static String COMMAND_LIST = "list";
    private final static String COMMAND_EXIT = "exit";
    private static String name;
    private static String phone;
    private static String phoneTemp;

    public static void main(String[] args) {


        Map<String, String> person = new TreeMap<>();

        System.out.println("Введите Ф.И.О, номер телефона через 8 или +7 или всё вместе.");
        while (true) {

            String userInput = UserInput.getLine();
            Matcher matcherN = Pattern.compile("[А-ЯЁ][а-яё]*" +
                    "([-][А-ЯЁ][а-яё]*)?\\s" +
                    "[А-ЯЁ][а-яё]*\\s" +
                    "[А-ЯЁ][а-яё]*").matcher(userInput);

            Matcher matcherPh = Pattern.compile("((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?([\\d][\\- ]?){7,10}")
                    .matcher(userInput);
            if (userInput.equals(COMMAND_LIST)) {
                System.out.println("\t\tСписок абонентов: ");
                person.forEach((a, b) -> System.out.println(a + ": " +
                        b.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "$1 ($2) $3-$4-$5")));
                continue;

            } else if (userInput.equals(COMMAND_EXIT)) {

                break;

            } else
            if (matcherN.find() && matcherPh.find()) {
                name = matcherN.group().replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{4})\\s+", "");
                phone = matcherPh.group().replaceAll("[^0-9]", "").trim()
                        .replaceFirst("\\d", "+7");
                //phoneTemp = phone.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "$1 ($2) $3-$4-$5");
                person.put(name, phone);

            } else if (person.containsKey(name)) {
                phone = person.get(name);
                person.put(name, phone);
                System.out.println("У абонента - " + name + " телефон: " + phone);

            } else if (person.containsValue(phone)) {
                name = person.get(phone);
                person.put(name, phone);
                System.out.println("Телефон - " + phone + " принадлежит абоненту: " + name);
            }

            else {

                System.out.println("неверная команда");

            }

        }

    }
}
    class UserInput {

        public static String getLine() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ваши действия: ");
            String str = scanner.nextLine();
            return str;
        }
    }