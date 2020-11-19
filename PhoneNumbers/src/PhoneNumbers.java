import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumbers {
    public static void main(String[] args) {
        String regex = "(?<aNum>\\+7?)(?<bNum>\\(\\d{3}\\))(?<cNum>\\s\\d{3}\\-\\d{2}\\-\\d{2})";

        System.out.println(regex);
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер телефона в любом формате: ");
        String number = scan.nextLine();

        String numTemp = number.replaceAll("[^0-9]", "");
        numTemp = numTemp.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{4})", "+$1 ($2) $3-$4");
        System.out.println(numTemp);
    }
    }

        /*if (numTemp.matches("((7|8)\\d{10})")){
            if (numTemp.matches("^(8){1}\\d{10}$")) {
                System.out.println(numTemp.replaceAll(regex));
            }
        if (numTemp.matches("(7|8)\\d{10}")) {
            String formattedPhone = numTemp.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{4})",
                    "+$1 ($2) $3-$4");
        } else if (numTemp.matches("^(9?\\d{9})$") && numTemp.length() == 10) {
            numTemp = numTemp.replace(numTemp, "+$1 ($2) $3-$4");
            System.out.println(numTemp);
        } else System.out.println("Некорректный номер!");
    }
}
        /*Pattern.compile("(?<aCode>[a-z]{1,1})(?<dCode>[0-9]{2,2})")
                .matcher("a38 d45")
                .replaceAll("${dCode}${aCode}");//result: '38a 45d'

    /*Regex breakdown: (?<aCode>[a-z]{1,1})(?<dCode>[0-9]{2,2})
   (	Starting the first capturing group.	 ?<aCode>	Giving name to this capturing group: 'aCode.'	 [a-z]{1,1}	Must contain exactly one alphabet.	)	Closing the first capturing group.	(	Start the second capturing group.	 ?<dCode>	Giving name to this capturing group: 'dCode'.	 [0-9]{2,2}	Must contain exactly two digits.	)	Closing the second group.
*/

        /* Using capturing group number
        Pattern.compile("([a-z]{1,1})([0-9]{2,2})")
                .matcher("a38 d45")
                .replaceAll("$2$1");//result: '38a 45d'


/*String regex2 = "(?<aNum>\\+7?)(?<bNum>\\(\\d{3}\\))(?<cNum>\\s\\d{3}\\-\\d{2}\\-\\d{2})";
        String string = "+7(951) 905-44-33";

        Pattern p = Pattern.compile(regex, Pattern.MULTILINE);

        Matcher m = p.matcher(number);

        while (m.find()) {
            System.out.println("Full match: " + m.group(0));
            for (int i = 1; i <= m.groupCount(); i++) {
                System.out.println("Group " + i + ": " + m.group(i));
            }
        }*/


