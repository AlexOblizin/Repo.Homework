import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int a1;
        do {
            a1 = scan.nextInt();
            System.out.println("Вы ввели: " + a1);
            if (a1 != 5) System.out.print("Для выхода из цикла нужно ввести 5. Введите число: ");
        } while (a1 != 5);


        for (int i = 0; i <= 15; i++) {
        if (i % 2 == 0) continue; //просто еще раз инкрементирует i - после попадания на четное число
            // цикл его пропускает и выводит только нечетные с 0 до 15. Если условие с continue true,
            // то итерация в этот раз не выполняется до следующей проверки.
            System.out.println("Это нечетное число - " + i);
        }

        String[] s_arr = new String[7];
        s_arr[0] = "Привет";
        s_arr[1] = "Как";
        s_arr[2] = "Дела";
        s_arr[3] = "Чем";
        s_arr[4] = "Занимаешься";
        s_arr[5] = "Йобана";
        s_arr[6] = "Рот";

        System.out.println();
        for (String a2 : s_arr) System.out.print(a2 + " ");

        int[][] matrix = {{23,12,471},
                          {232,253,311},
                          {21,578,90}};
        System.out.println("\n");

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        }
    }
