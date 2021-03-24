package console_calculator.calculator.input_output;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInput {

    public static String userInput() {
        String input;
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nЧто вы хотите посчитать? (exit для выхода) #: ");
        input = scanner.nextLine();

        return input;
    }

    public static boolean exit(String exit) {

        Pattern pattern = Pattern.compile("^(exit)$");
        Matcher matcher = pattern.matcher(exit);

        return matcher.matches();
    }
}
