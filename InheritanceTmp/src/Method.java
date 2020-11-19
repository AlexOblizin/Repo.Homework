package extend;

import java.util.Scanner;

public class Method
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input city: ");
        String city = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.printf("Name: %s City: %s Age: %d \n", name, city, age);
        in.close();

        System.out.println();

        Person ptest = new Person("Иван","Харьков", 20);
        System.out.println(ptest.getTextInfo());

        System.out.println();

        Person p = new Person(name, city, age);
        System.out.println(p.getTextInfo());
        p.setName(name);
        System.out.println(p.getName());
        p.setCity(city);
        System.out.println(p.getCity());
        p.setAge(age);
        System.out.println(p.getAge());

        Person pNew = new Person("Геракл", "Ашхабад", 35);
        {
            System.out.println(pNew.name + " " + pNew.city + " " + pNew.age);
            p.whoIsOlder(pNew); // но можно и наоборот pNew.whoIsOlder(p);
            pNew.whoIsOlder(p);
            }

        pNew.setName(); // используем перегрузку метода сеттера - просто перезадаём параметры объекта pNew заново
        pNew.setCity(); // используем перегрузку метода сеттера - просто перезадаём параметры объекта pNew заново
        pNew.setAge(); // используем перегрузку метода сеттера - просто перезадаём параметры объекта pNew заново
        // они задаются в перегруженных сеттерах в классе Person в виде Defaul name, Default city и 15
        System.out.println(pNew.getTextInfo());

    }
}

