import java.util.Scanner;

public class EnglishTextSplit {

        public static void main(String[] args) {

            String englishText = "English texts for beginners to practice reading and comprehension online " +
                    "and for free. Practicing your comprehension of written " +
                    "English will both improve your vocabulary and understanding of grammar" +
                    " and word order. The texts below are designed to help you develop while " +
                    "giving you an instant evaluation of your progress." +
                    "Prepared by experienced English teachers, the texts, articles and" +
                    " conversations are brief and appropriate to your level of proficiency." +
                    " Take the multiple-choice quiz following each text, and you'll get the results immediately." +
                    " You will feel both challenged and accomplished! " +
                    "You can even download (as PDF) and print the texts and exercises. " +
                    "It's enjoyable, fun and free. Good luck!";


            String etext = englishText.replaceAll("[^A-Za-z ]","");

            String eTextRight[] = etext.split(" ");
            for (int i = 0; i < eTextRight.length; i++){
                System.out.println(eTextRight[i]);
            }

            /*String[] eTextRight = englishText.split("[\\p{Punct}\\s]+");
            for (String s : eTextRight) {
                System.out.println(s);
            }*/ // второй вариант решения

    }
}
