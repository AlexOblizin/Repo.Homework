public class Loader {
    public static void main(String[] args) {
        String fazan = "Каждый охотник желает знать, где сидит фазан";


        String[] arrayFazan = fazan.split("\\,?\\s");

        for (int i = 0; i < arrayFazan.length / 2; i++) { //заполнение задом наперед
            String tmp = arrayFazan[i];
            arrayFazan[i] = arrayFazan[arrayFazan.length - 1 - i];
            arrayFazan[arrayFazan.length - 1 - i] = tmp;
        }
        System.out.println();
        System.out.println("В одну строку задом наперёд:");
        System.out.println();
        for(String str : arrayFazan){
            System.out.print(str.toLowerCase() + " ");
        }
        System.out.println();

     }
}