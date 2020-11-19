import java.math.BigDecimal;
import java.math.RoundingMode;

public class Loader {
    public static void main(String[] args) {

        int b = Integer.parseInt("11", 8); // 11 в восьмеричной это
        System.out.println(b); // 9  в десятичной


       char cArr[] = {'a','b','c','d'};

       String s = new String(cArr);
       System.out.println(s);
       BigDecimal bd = new BigDecimal(5.4659684633);
        System.out.println(bd.setScale(3, RoundingMode.HALF_UP));
        System.out.println(new BigDecimal(5.4659684633).setScale(3, RoundingMode.HALF_UP));
        System.out.println(new BigDecimal(Math.PI).setScale(2, RoundingMode.HALF_UP));

        // получаем случайное целое число от 0 до 10
        int i = (int) (Math.random() * 11);
        System.out.println(i);
        // получаем случайное целое число от 1 до 10
        int i1 = (int) (1 + Math.random() * 10);
        System.out.println(i1);

    }
}
