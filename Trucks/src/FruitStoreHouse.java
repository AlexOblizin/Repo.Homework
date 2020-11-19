package Trucks.src;


import java.util.List;
import java.util.Random;

public class FruitStoreHouse {

    Random rand = new Random(System.currentTimeMillis());

    public void loadCargo(List<Plants> cargo) {
        while (cargo.size() < 10) {
            cargo.add(fruitGen());

        }

        System.out.println("Нельзя добавлять груз. Грузовик полон.");


    }


    Fruits fruitGen() {
        switch (rand.nextInt(3)) {
            case 0:
                return new Orange();
            case 1:
                return new Peach();
            case 2:
            default:
                return new Apple();
        }
    }
}
