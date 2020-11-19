
public class Cat {

    private static final double MIN_WEIGHT = 1000.0;
    private static final double MAX_WEIGHT = 9000.0;
    public static final int LEGS_COUNT = 4;
    public static final int EYES_COUNT = 2;

    private double foodWeight = 0;
    private double originWeight;
    private double weight;


    private ColoursOfCat colourCat;
    private String nameCat;
    private boolean catAlive;
    public static int count;


    public Cat() {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Cat(double weight) {
        this.weight = weight;
        this.originWeight = weight;
        if (weight >= MIN_WEIGHT && weight <= MAX_WEIGHT)
        {
            count++;
            catAlive = true;
        }
    }

    public Cat(Cat cat) {
        this.weight = cat.weight;
        this.originWeight = cat.originWeight;
        this.colourCat = cat.colourCat;
        this.nameCat = cat.nameCat;
        if (weight >= MIN_WEIGHT && weight <= MAX_WEIGHT)
        {
            count++;
            catAlive = true;
        }
    }

    public static int getCount() {
        return count;
    }

    public double getEatenFood() {
        return foodWeight;
    }


    public void setColourCat(ColoursOfCat colourCat) {
        this.colourCat = colourCat;
    }


    public ColoursOfCat getColourCat() {
        return colourCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }


    public void meow() {
        if (!catAlive) { // проверяем жива ли текущая кошка
            System.out.println("Кошка умерла");
        } else {
            weight = weight - 150;
            System.out.println("Мяу");
            isAlive();   // проверка, чтобы убедиться, что после мяу кошка всё ещё жива
        }

    }

    public String getStatus() {
        if (weight < MIN_WEIGHT) {
            return "мертва";
        } else if (weight > MAX_WEIGHT) {
            return "лопнула";
        } else if (weight > originWeight) {
            return "cпит";
        } else {
            return "играет";
        }
    }

    public void pee (Double amount) {
        if (catAlive)
        {
            weight -= amount;
            System.out.println("Кошка сходила в туалет");
            isAlive();
        }
        else System.out.println("Кошка мертва и не может сходить в туалет");
    }

    public Boolean isAlive() {
        if (catAlive)
        {   //текущая кошка жива была, перепроверим её статус
            if (weight >= MIN_WEIGHT && weight <= MAX_WEIGHT)
            { // проверили вес
                return true;
            }
            else
                { //если вес не соответствует, значит кошка умерла и нужно уменьшить
                // число и изменить статус
                count--;
                catAlive = false;
                return false;
                }
        }
        return false;
    }

    public void feed(double amount) {
        if (catAlive) {
            weight += amount;
            foodWeight += amount;
            isAlive();
        } else {
            System.out.println("dead cat cant eat");
        }
    }

    /*public void drink(double amount) {

        if (catAlive = true) weight += amount;

    }*/

}