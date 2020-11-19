import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {
    static String addTD = null;
    static String editTD = null;
    static boolean isQuit = false;
    static String temp = null;
    static String res = null;
    static int resIndex;
    public static void main(String[] args) {

        List<String> toDo = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (isQuit == false) {
            System.out.print("Ваши действия: ");
            temp = scanner.nextLine();
            String addReg = "^[Aa][Dd]{2}\\s+";
            if (temp.matches(addReg + ".+")) {
                temp = temp.replaceFirst(addReg, "");
                if (temp.matches("\\d+\\s+.+")) {
                    String[] mas = temp.split("\\s+", 2);
                    int index = Integer.parseInt(mas[0]);
                    if (index <= 0 || index > toDo.size()) {
                        System.out.println("Неверно! Введите корректный индекс в границах от 0 до " + toDo.size() + ": ");
                        continue;
                    }
                    toDo.add(index, mas[1]);
                } else {
                    toDo.add(temp);
                }
            }
            if (delete(temp)) {
                Matcher matcher = Pattern.compile("^(del\\s+\\d+\\s?)").matcher(temp);
                if (matcher.find()) {
                    res = matcher.group().replaceAll("\\D", "").trim();
                    resIndex = Integer.parseInt(res);

                }
                if (resIndex >= 0 && resIndex <= toDo.size() - 1) {

                    toDo.remove(resIndex);

                } else {System.out.println("Неверно! Введите корректный индекс в границах от 0 " +
                        "до " + (toDo.size() - 1) + ": ");}

            }

            if (edit(temp)) {
                Matcher matcher = Pattern.compile("^(edit\\s+\\d+\\s?)").matcher(temp);
                if (matcher.find()) {
                    res = matcher.group().replaceAll("\\D", "").trim();
                    resIndex = Integer.parseInt(res);
                }
                if (resIndex >= 0 && resIndex <= toDo.size() - 1) {
                    editTD = temp.replaceFirst("^(edit\\s+\\d+\\s+)", "").trim();
                    toDo.set(resIndex, editTD);
                }
                else System.out.println("Неверно! Введите корректный индекс в границах от 0 " +
                        "до " + (toDo.size() - 1) + ": ");

            }

            if (list(temp)) toDo.forEach((n) -> System.out.println(toDo.indexOf(n) + " " + n));
            if (exit(temp)) isQuit = true;
        }
    }
    static boolean add(String strAdd) {

        Pattern pattern = Pattern.compile("^(add\\s+)([A-Za-zА-Яа-яЁё0-9 ]+)$");
        Matcher matcher = pattern.matcher(strAdd);

        return matcher.matches();
    }
   /* static boolean addNum(String strAddNum) {

        Pattern pattern = Pattern.compile("^(ADD\\s+\\d+\\s+)([A-Za-z0-9А-Яа-яёЁ ]+)+$");
        Matcher matcher = pattern.matcher(strAddNum);

        return matcher.matches();
    }*/

    static boolean edit(String strEdit) {

        Pattern pattern = Pattern.compile("^(edit\\s+\\d+\\s?)([A-Za-zА-Яа-яЁё0-9 ]+)$");
        Matcher matcher = pattern.matcher(strEdit);

        return matcher.matches();
    }
    static boolean delete(String strDel) {

        Pattern pattern = Pattern.compile("^(del\\s+\\d+\\s?)$");
        Matcher matcher = pattern.matcher(strDel);
        return matcher.matches();
    }
    static boolean list(String strList) {

        Pattern pattern = Pattern.compile("^(list)$");
        Matcher matcher = pattern.matcher(strList);

        return matcher.matches();
    }
    static boolean exit(String strExit) {

        Pattern pattern = Pattern.compile("^(exit)$");
        Matcher matcher = pattern.matcher(strExit);

        return matcher.matches();
    }

}