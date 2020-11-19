package Trucks.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Plants> truckVeg = new ArrayList<>(10);
        List<Plants> truckFrt = new ArrayList<>(10);


        FruitStoreHouse fruitsHouse1 = new FruitStoreHouse();
        VegStoreHouse vegHouse1 = new VegStoreHouse();
        VegStoreHouse vegHouse2 = new VegStoreHouse();
        VegStoreHouse vegHouse3 = new VegStoreHouse();

        fruitsHouse1.loadCargo(truckFrt);

        vegHouse1.loadCargo(truckVeg);
        vegHouse2.loadCargo(truckVeg);
        vegHouse3.loadCargo(truckVeg);

        FoodShop.printCargo(truckFrt);
        System.out.println("\n");
        FoodShop.printCargo(truckVeg);




    }
}
