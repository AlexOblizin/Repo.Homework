public class Loader {
    public static void main(String[] args) {

        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        /*boolean found = false;*/

        for (int y : nums) System.out.print(y + " ");
        System.out.println("\n      Ищем 5");

        for (int x : nums) {

            System.out.println("Значение равно: " + x);
            if (x == val) {
                /*found = true;*/
                System.out.println("Значение найдено!");
                break;
            }
        }
            /*if (found) System.out.println("Знaчeниe найдено!");*/

        for (int i = 0; i < 150; i++) {
            for (int j = i; j < 150; j++) System.out.print(".");
                System.out.println();
                    }
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                System.out.println(
                "Предшествует оператору break.");
                if (t) break second; // выход из блока second
                System.out.println("Этот оператор не будет выполняться");
                }
                    System.out.println("Этот оператор не будет выполняться");
            }
            System.out.println("Этот оператор следует за блоком second.");
        }
        outer: for (int i = 0; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
        }
    }
