import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        /*Container container = new Container();
        container.count += 7843;*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.nextLine();

        // этот метод проверяет соответствует ли строка регулярному выражению.
        // Решение для проверки наличия цифр в строке - ^ и $ указывают на начало и конец
        // проверяемой строки, \\D - на нецифровой символ
        // (обратный слэш удваивается для правильной интерпретации компилятором - так как есть случаи,
        // когда используется одинарный - типа \n \t и пр.),
        // * проверяет использование символов ноль или более раз.
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
        if ((count > 0) && (summa > 0)) System.out.println("Строка состоит из " + count + " цифр и их сумма = " + summa);
        else System.out.println("Невозможно вычислить сумму!");

        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите целое число: ");
        int c = in.nextInt();
        in.close();
        System.out.printf("Сумма цифр = %d%n", sumDigits(c));
    }

    public static int sumDigits(Integer number)
    {
        //@TODO: write code here
        String digits = Integer.toString(number);
        int sum = 0;
        for (char a: digits.toCharArray())
            sum += a - '0'; // вычитаем символ '0' - потому что, если не вычесть, то число будет на 48 больше,
                            // поскольку 0 в ASCII как раз 48
        return sum;

    }
}
