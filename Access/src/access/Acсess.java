package access;

public class Acсess
{
    public static void main(String[] args)
    {
        /*Person2 p = new Person2();
        System.out.println(p.name); // работает везде, так как это public
        System.out.println(p.city); // работает, т.к. классы входят в один пакет access
      *//*  System.out.println(p.age);  ошибка ибо свойство age имеет доступ private
      (доступно исключительно внутри класса Person2, но не в дочерних объектах)*//*
        System.out.println(p.getAge());*/
        new Person2();
        System.out.println("Создано объектов " + Person2.count);
        new Person2();
        System.out.println("Создано объектов " + Person2.count); // создаем некие объекты без параметров,
        // но при каждом создании нового объекта счетчик count увеличиается на 1.
        new Person2();
        System.out.println("Создано объектов " + Person2.getCount());
        // Person2.setName(); - ошибка. Не можем вызвать, так как он принадлежит объекту внутри класса,
        // но не классу вцелом (p.setName() - можем вызвать - так как p - это объект внутри класса),
        // а Person2.getCount(); - можем вызвать, так как это static - то есть принадлежит классу
        Person2 aa = new Person2();
        System.out.println(aa.count); // так писать неграмотно, но java это допускает (хоть и предлагает
        // заменить ссылкой на класс - и записать как Person2.count) так как
        // count static переменная внутри класса Person2 и распространяется на все объекты внутри класса
        System.out.println(Person2.count);

    }

}
