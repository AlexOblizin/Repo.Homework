public class Loader {
    public static void main(String[] args) {
        int jun;
        int middle;
        int senior = 0;
        int sum = 280000;

        while (senior != sum - (senior - 20000) - (((senior - 20000) + senior) - 160000)) {
            senior++;
        }
        middle = (senior - 20000);
        jun = (middle + senior) - 160000;

        System.out.println("Зарплата senior: " + senior);
        System.out.println("Зарплата middle: " + middle);
        System.out.println("Зарплата junior: " + jun);

        char a = 'A';
        a++;
        System.out.println((int) a);

        int w = (int) 888.8;
        byte x = (byte) 100L;
        long y = (byte) 100;
        byte z = (byte) 100L;

        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


        
    }
}

