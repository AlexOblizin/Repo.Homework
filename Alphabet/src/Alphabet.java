public class Alphabet {
    public static void main(String[] args) {
        System.out.println("\n\tМаленькие буквы латинского алфавита:");
        char chS = 97;
        while (chS <= 122){
           System.out.println("Буква " + chS + " и ее код: " + (int) chS);
           ++chS;
        }

        System.out.println("\n\tБольшие буквы латинского алфавита:");
        char chL = 65;
        while (chL <= 90){
            System.out.println("Буква " + chL + " и ее код: " + (int) chL);
            ++chL;
        }

        /*String strS = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("Маленькие буквы латинского алфавита:");
        System.out.println(strS);
        char chS[] = strS.toCharArray();
        for (int i = 0; i < strS.length(); i++) {
            System.out.println("Буква: " + chS[i] + " \tи ее код: " + (int) strS.charAt(i));

        }*/

        /*for (int i = 0; i < chS.length; i++) {
            if (Character.isLowerCase(chS[i])) {
                chS[i] = Character.toUpperCase(chS[i]);
            }

        }
        System.out.println();
        System.out.println("Большие буквы латинского алфавита:");
        String strL = new String(chS);
        System.out.println(strL);
        char[] chL = strL.toCharArray();
        for (int i = 0; i < strL.length(); i++) {
            System.out.println("Буква: " + chL[i] + " \tи ее код: " + (int) strL.charAt(i));

        }*/

    }
}
