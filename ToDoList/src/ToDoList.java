import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    static String addTD = null;
    static String delTD;
    static String editTD;
    static boolean isQuit = false;
    static String temp;

    public static void main(String[] args) {

        List<String> toDo = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (isQuit == false) {

            System.out.println("\n(add) Запланировать дело;\n(edit) Изменить запланированное дело;\n" +
                    "(del) Удалить запланированное дело;\n(list) Список запланированных дел;\n(exit) Выйти из программы");
            System.out.print("Что вы выбираете: ");

            temp = scanner.nextLine();

            System.out.println();

            switch (temp) {

                case "add":

                    System.out.print("Введите, что хотите запланировать: ");
                    temp = scanner.nextLine();
                    addTD = temp;
                    toDo.add(addTD);
                    break;

                case "edit":

                    System.out.print("Введите номер изменения в границах от 0 до " + (toDo.size() - 1) + ": ");
                    String editNo = scanner.nextLine();
                    while (Integer.parseInt(editNo) < 0 || Integer.parseInt(editNo) > toDo.size() - 1) {
                        System.out.print("Неверно! Введите корректный индекс в границах от 0 до " + (toDo.size() - 1) + ": ");
                        editNo = scanner.nextLine();
                    }
                    toDo.remove(Integer.parseInt(editNo));

                    System.out.print("Текст изменения: ");
                    scanner = new Scanner(System.in);
                    editTD = scanner.nextLine();
                    toDo.add(Integer.parseInt(editNo), editTD);
                    break;

                case "del":

                    System.out.print("Введите номер дела в границах от 0 до " + (toDo.size() - 1) + ", которое нужно удалить: ");
                    delTD = scanner.nextLine();

                    while (Integer.parseInt(delTD) < 0 || Integer.parseInt(delTD) > toDo.size() - 1) {
                        System.out.print("Неверно! Введите корректный индекс в границах от 0 до " + (toDo.size() - 1) + ": ");
                        delTD = scanner.nextLine();
                    }

                    toDo.remove(Integer.parseInt(delTD));

                    break;

                case "list":
                    toDo.forEach((n) -> System.out.println(toDo.indexOf(n) + " " + n)); //использую лямбда-выражение
                    break;

                case "exit":
                    isQuit = true;
                    break;

                default:
                    System.out.println("Неверно! Введите add, list, edit, del или exit!");
            }
        }
    }
}