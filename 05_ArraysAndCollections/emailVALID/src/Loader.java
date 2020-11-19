import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {
    private final static String COMMAND_ADD = "add";

    private final static String COMMAND_LIST = "list";

    public static void main(String args[]) {

        EmailList emailList = new EmailList();

        for (; ; ) {

            String userInput = UserInput.getLine();

            if (userInput.startsWith(COMMAND_ADD)) {
                String str = userInput.replaceFirst(COMMAND_ADD, "").trim();
                if (EmailList.validate(str)) emailList.add(str);
                else System.out.println("Неверный e-mail!");

            } else if (userInput.equals(COMMAND_LIST)) {

                emailList.printList();

            } else {

                System.out.println("неверная команда");

            }

        }

    }

}
class EmailList {

    HashSet<String> emailList = new HashSet<>();

    void printList (){
        emailList.forEach((n) -> System.out.println(n));
    }

    public void add(String trim) {
        emailList.add(trim);
    }
    static boolean validate(final String hex) {

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(hex);

        return matcher.matches();
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