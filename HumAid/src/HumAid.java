import java.util.Scanner;

public class HumAid {
    public static final int MAX_BOXES_IN_CONTAINER = 5;
    public static final int MAX_CONTAINERS_IN_TRUCK = 3;

    public static void main(String[] args) {
        int countContainer = 1;
        int countTruck = 1;
        System.out.print("\nВведите количество ящиков с гуманитарной помощью: ");
        Scanner scanAmount = new Scanner(System.in);
        int amountOfBoxes = scanAmount.nextInt();

        int i = 0;
        if (isRealAid(amountOfBoxes) == true) {
            System.out.println("\tГрузовик №: " + countContainer);
            System.out.println("\t\tКонтейнер №: " + countTruck);
            for (i = 1; i < amountOfBoxes; i++) {

                System.out.println("Ящик №: " + i);
                if (isContFull(i)) {
                    countContainer++;
                    if (isTruckFull(i)) countTruck++;

                    if (isTruckFull(i)) System.out.println("\tГрузовик №: " + countTruck);
                    System.out.println("\t\tКонтейнер №: " + countContainer);

                }

            }
        } else System.out.println("Груз с гуманитарной помощью не сформирован!");
        System.out.println("Ящик №: " + i);



        if (isRealAid(amountOfBoxes) == true) {
            System.out.println("\nИтого необходимо:\n");
            System.out.println("Ящиков: " + amountOfBoxes);
            System.out.println("Контейнеров: " + countContainer);
            System.out.println("Грузовиков: " + countTruck);

        }
        if (isContNotFull(i)) System.out.println("Контейнер " + countContainer + " будет" +
                " не до конца заполнен.");
        if (isTruckNotFull(i)) System.out.println("Грузовик " + countTruck + " будет" +
                " не до конца заполнен.");

    }
    static boolean isRealAid(int amount) {
        if (amount > 0) return true;
        else return false;
    }
    static boolean isContFull(int amount){
        if (amount % MAX_BOXES_IN_CONTAINER == 0) return true;
        else return false;
    }
    static boolean isTruckFull(int amount){
        if (amount % MAX_CONTAINERS_IN_TRUCK == 0) return true;
        else return false;
    }
    static boolean isContNotFull(int amount){
        if (amount % MAX_BOXES_IN_CONTAINER !=0) return true;
        else return false;
    }
    static boolean isTruckNotFull(int amount){
        if (amount % MAX_CONTAINERS_IN_TRUCK !=0) return true;
        else return false;
    }
}
