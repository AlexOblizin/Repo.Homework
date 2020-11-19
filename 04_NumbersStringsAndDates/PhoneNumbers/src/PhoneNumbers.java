import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер телефона в любом формате: ");
        String number = scan.nextLine();

        String numTemp = number.replaceAll("[^0-9]", "");
        if (numTemp.matches("^((7|8){1}\\d{10})$")){
            if (numTemp.matches("^(8){1}\\d{10}$")) {
                System.out.println(numTemp.replaceFirst("8","7"));
            }
            if (numTemp.matches("^(7){1}\\d{10}$")){
                System.out.println(numTemp);
            }
        }
        else if (numTemp.matches("^(9?\\d{9})$") && numTemp.length() == 10){
            numTemp = numTemp.replace(numTemp, "7" + numTemp);
            System.out.println(numTemp);
        }

        else System.out.println("Некорректный номер!");

    }
}
