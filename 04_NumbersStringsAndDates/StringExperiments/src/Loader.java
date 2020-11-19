
public class Loader
{
    public static void main(String[] args)
    {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(text);
        /*String str = text.trim();*/

        int a = text.lastIndexOf("й,");
        String firstStr = text.substring(0, a + 1);
        System.out.println(firstStr);
        int b = text.lastIndexOf("ля");
        String secondStr = text.substring(a + 3, b + 2);
        System.out.println(secondStr);
        int c = text.indexOf("Ма");
        String thirdStr = text.substring(c);
        System.out.println(thirdStr);

        String s1 = new String();
        for (int i = 0; i < firstStr.length(); i++){
            if ((int) firstStr.charAt(i) >= 48 && (int) firstStr.charAt(i) <= 57) {
                s1 = s1 + firstStr.charAt(i);
            }
        }
        System.out.println(s1 + " руб.");

        String s2 = new String();
        for (int i = 0; i < secondStr.length(); i++){
            if ((int) secondStr.charAt(i) >= 48 && (int) secondStr.charAt(i) <= 57) {
                s2 = s2 + secondStr.charAt(i);
            }
        }
        System.out.println(s2 + " руб.");

        String s3 = new String();
        for (int i = 0; i < thirdStr.length(); i++){
            if ((int) thirdStr.charAt(i) >= 48 && (int) thirdStr.charAt(i) <= 57)
            {
                s3 = s3 + thirdStr.charAt(i);
            }
        }
        System.out.println(s3 + " руб.");
        int sum = Integer.parseInt(s1) + Integer.parseInt(s2) + Integer.parseInt(s3);
        System.out.println("В сумме они зарабатывают - " + sum + " руб.");


    //всё считается, даже если поменять суммы у каждого, но только, если эти суммы есть - иначе ошибка
    // в парсинге строки.
    }
}