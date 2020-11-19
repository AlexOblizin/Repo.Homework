public class StrExperiment2 {
    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text);

        String sent[] = text.split("(, )+",3);
        int sum = 0;

        for (int i = 0; i < sent.length; i++) {
            System.out.println(sent[i]);
            int tmp = Integer.parseInt(sent[i].replaceAll("[^0-9]",""));
            sum += tmp;
        }
        System.out.println("В сумме они зарабатывают - " + sum + " руб.");

        //Второй вариант решения:

        System.out.println("\n\n\t\t\tВариант упрощенный:\n");
        String text2 = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text2);
        String[] sent2 = text.replaceAll("\\D+", " ").trim().split(" ",3);
        int sum2 = 0;
        for (String s : sent2) {
            int tmp2 = Integer.parseInt(s);
            sum2 += tmp2;
        }
        System.out.println("В сумме они зарабатывают - " + sum2 + " руб.");
    }
}
