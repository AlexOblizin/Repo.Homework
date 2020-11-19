import java.util.Scanner;

public class AdditionalHW {

        public static void main(String[] args)
        {

            Scanner sc = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String str = sc.nextLine();


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
            System.out.printf("Сумма цифр = %d%n", HWAdd.sumDigits(c));
        }



    }


class HWAdd {
    public static int sumDigits(Integer number) {
        //@TODO: write code here
        String digits = Integer.toString(number);
        int sum = 0;
        for (char a : digits.toCharArray())
            sum += a - '0'; // вычитаем символ '0' - потому что, если не вычесть, то число будет на 48 больше,
        // поскольку 0 в ASCII как раз 48
        return sum;
    }
    void resultMeth(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scan.nextLine();

        char[] ch1 = str.toCharArray();

        for (int i = 0; i < ch1.length; i++) {
            if (Character.isDigit(i) ;
            else if (Character.isLowerCase(ch1[i])) ch1[i] = Character.toUpperCase(ch1[i]);
        }

        str = new String(ch1);
        System.out.println(str);

    }


}