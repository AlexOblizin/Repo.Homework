import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {

        Callback c = new Client(); // ссылку можно обзывать типом класса, реализующего интерфейс
        AnotherClient ob = new AnotherClient();
        c.callback(43);

        System.out.println();

        ((Client) c).nonIfaceMeth();

        c = ob; // теперь переменная с ссылается на объект типа AnotherClient

        System.out.println();
        c.callback(43);

        A.NestedIF nif = new B(); // используем ссылку на вложенный интерфейс
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x1 = scan.nextInt();

        if (nif.isNotNegative(x1)) System.out.println("Число " + x1 + " не отрицательное");
        if (!nif.isNotNegative(x1)) System.out.println("Число " + x1 + " отрицательное");


        System.out.println(Callback.getDefaultNumber()); // static метод не присваивается к экземпляру класса,
        // а работает просто так, сам. Записывается, как название интерфейса, где он определен,
        // потом точка и имя метода.

    }
}

class Client implements Callback {
    // реализовать интерфейс Callback
    public void callback(int p) {
        System.out.println("Метод callback(), " +
                "вызываемый со значением " + p);
    }
        void nonIfaceMeth(){
            System.out.println("В классах, реализующих интерфейсы, могут определяться и другие члены.");
        }


}

//ещё одна реализация интерфейса Callback
class AnotherClient implements Callback{
   public void callback (int p){
       System.out.println("Еще один вариант метода callback()");
       System.out.println("         p в квадрате равно " + (p * p));
   }
}
abstract class Incomplete implements Callback{ // метод который реализует интерфейс не полностью
                                                // должен быть абстрактным
    int a,b;
    void show(){
        a = 10;
        b = 15;
        System.out.println(Math.pow(a,2) + Math.pow(b,3));
    }
}
// класс A содержит интерфейс как свой член
class A{
    public interface NestedIF{  // это вложенный интерфейс
        boolean isNotNegative(int x);
    }
}

// Класс B реализует вложенный интерфейс
class B implements A.NestedIF {
    public boolean isNotNegative(int x){
        return x < 0 ? false : true;
    }
}


