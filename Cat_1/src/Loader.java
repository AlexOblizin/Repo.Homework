import java.util.Scanner;

public class Loader
{
    public static void main(String[] args)
    {
       Cat cat1 = new Cat();

        cat1.setColourCat(ColoursOfCat.GREY);
        System.out.println(cat1.getColourCat() + " кошка cat1 весит - " + cat1.getWeight() + " гр.");
        System.out.println(cat1.getStatus());

        Cat cat2 = new Cat();

        cat2.setColourCat(ColoursOfCat.BLUE);
        System.out.println(cat2.getColourCat() + " кошка cat2 весит - " + cat2.getWeight() + " гр.");
        System.out.println(cat1.getStatus());

        Cat cat3 = new Cat();

        cat3.setColourCat(ColoursOfCat.WHITE);
        System.out.println(cat3.getColourCat() + " кошка cat3 весит - " + cat3.getWeight() + " гр.");
        System.out.println(cat1.getStatus());

        Cat cat4 = new Cat();
        cat4.setColourCat(ColoursOfCat.GREY);
        System.out.println(cat4.getColourCat() + " кошка cat4 весит - " + cat4.getWeight() + " гр.");
        System.out.println(cat1.getStatus());

        Cat cat5 = new Cat();
        cat5.setColourCat(ColoursOfCat.BROWN);
        System.out.println(cat5.getColourCat() + " кошка cat5 весит - " + cat5.getWeight() + " гр.");
        System.out.println(cat1.getStatus());
                System.out.println();

        System.out.println("Мы покормили кошек cat1 и cat2 (дали поесть разные по весу порции)" + "\n");

        cat1.feed(950 + 50 * Math.random());
        System.out.println("кошка cat1 весит - " + cat1.getWeight() + " гр.");
        System.out.println("вес еды, которой покормили cat1: " + cat1.getEatenFood() + " гр." + "\n");

        cat2.feed(950 + 50 * Math.random());
        System.out.println("кошка cat2 весит - " + cat2.getWeight() + " гр.");
        System.out.println("вес еды, которой покормили cat2: " + cat2.getEatenFood() + " гр." + "\n");

        System.out.println("кошка cat3 весит - " + cat3.getWeight() + " гр.");
        System.out.println("кошка cat4 весит - " + cat4.getWeight() + " гр." + "\n");

        //кошка cat5 сходила в туалет
        System.out.println("Cat5 захотела в туалет");
        cat5.pee(100 - 50 * Math.random());
        System.out.println();
        System.out.println("кошка cat5 весит - " + cat5.getWeight() + " гр.");

        System.out.println();
        System.out.println("Замяукиваем cat3");

        while (cat3.isAlive())
                {
                cat3.meow();
                System.out.println("кошка cat3 весит - " + cat3.getWeight() + " гр.");
                System.out.println(cat3.getStatus());
                }

            System.out.println("Количество кошек теперь равно: " + Cat.getCount());

        System.out.println("cat3 сдохла(((");

        System.out.println();
        System.out.println("Перекармливаем cat4");

        do{
            cat4.feed(750 + 50 * Math.random());
            System.out.println("кормим...");
            System.out.println("кошка cat4 весит - " + cat4.getWeight() + " гр.");
          }
        while (cat4.isAlive());
        System.out.println("cat4 лопнула(((");

        System.out.println("Общее количество кошек равно: " + Cat.getCount());


        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите вес cat6: ");
        double wc = in.nextDouble();
        System.out.println("Вес " + wc);
        in.close();

        Cat cat6 = new Cat();
        
        cat6.setWeight(wc);

        cat6.setColourCat(ColoursOfCat.BLACK);
        if (wc == 1100) System.out.println("кошка Cat6 весит: " + cat6.getWeight() + " гр." + " и это котёнок");
        else if (!cat6.isAlive()) {
            System.out.println("кошка " + cat6.getStatus());
        
        }
        else System.out.println("кошка Cat6 весит: " + cat6.getWeight() + " гр.");
        System.out.println("Общее количество кошек равно: " + Cat.count);

        System.out.println();

        // Урок 7 ДЗ: добавили сеттер и геттер на еще одну кошку - немного другой, чем раньше)
        Cat cat7 = new Cat();
        
        cat7.setColourCat(ColoursOfCat.BLUE);
        System.out.println(cat7.getColourCat() + " cat7 добавилась по условиям задачи");
        System.out.println("Общее количество кошек равно: " + Cat.count + "\n");
    

        
        Cat cat8 = new Cat();
        
        cat8.setNameCat("cat8");
        cat8.setWeight(1500.0);
        cat8.setColourCat(ColoursOfCat.CALICO_CAT);
    System.out.println(cat8.getColourCat() + " кошка " + cat8.getNameCat() + " с весом " + cat8.getWeight());

       System.out.println("\nОбщее количество кошек равно: " + Cat.count);
       System.out.println();

       Cat cat9 = new Cat(cat8);


       System.out.println("кошка cat9: копия кошки - имя: " + cat9.getNameCat() + " вес:" + cat9.getWeight() + " цвет:" + cat9.getColourCat());
       System.out.println("\nОбщее количество кошек равно: " + Cat.count);


    }
   
}