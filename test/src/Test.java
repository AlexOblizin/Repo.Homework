import javax.swing.*;

public class Test {
    public static void main(String[] args) {

        /*String in;
        in = JOptionPane.showInputDialog(null,"Введите положительное число: ", JOptionPane.QUESTION_MESSAGE);
        if (in != null && !in.equals("")) {
            int i = 0;
            int n = Integer.parseInt(in);
            int summa = 0;
            while (i <= n) {
                summa += i;
                i++;
            }
            System.out.println(summa);
        }
        else
            {
            System.out.println("Вы ввели неверное число!");
            }*/

        int a = 0;
    String s1;

    while (true)
        {
        switch (a) {
            case 0:
                s1 = "Ноль";
                break;
            case 1:
                s1 = "Один";
                break;
            case 2:
                s1 = "Два";
                break;
            case 3:
                s1 = "Три";
                break;
            case 4:
                s1 = "Четыре";
                break;
            case 5:
                s1 = "Пять";
                break;
            case 6:
            default:
                s1 = "Другое число";
        }
        System.out.println(a + " - " + s1);
        a++;
        if (a > 5) break;
    }
  }
}




