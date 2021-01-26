import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    static boolean phoneValid(String phone) {

        Pattern pattern = Pattern.compile("^[+]{1}[7]{1}[0-9]{10}$");
        Matcher matcher = pattern.matcher(phone);

        return matcher.matches();
    }
    static boolean emailValid(String email) {

    Pattern pattern =
        Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }



}


