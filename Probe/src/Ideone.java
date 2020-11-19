import java.util.Scanner;

class Ideone {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.next();

        if (str.matches("^\\D*$")) System.out.println("Строка не содержит цифр!");


        int count = 0, summa = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
            {
                count++;
                summa += Integer.parseInt(String.valueOf(str.charAt(i)));
            }

        }
        if ((count > 0) && (summa > 0)) System.out.println("Строка содержит " + count + " цифр и их сумма = " + summa);
        else System.out.println("Невозможно вычислить сумму!");

    }
}