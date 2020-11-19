import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Loader {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
        int n = (int) (Math.random() * 11);
        arr.add(n);
            System.out.println(arr.get(i));
        }
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + "  ");
        }
        System.out.println();
        System.out.println(arr.contains(7)); // возвращает true, если элемент есть и false - если нет.
        System.out.println(arr.indexOf(5));// если есть элемент, то метод возвращает его индекс
        // (первого элемента, если их несколько), если нет, то возвращает -1
        System.out.println("Размер массива - " + arr.size() + " элементов.");
        System.out.println(arr.remove(3)); // удаляет элемент с соответствующим индексом
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + "  ");
        }
        System.out.println("\nТеперь размер массива - " + arr.size() + " элементов."); //и теперь элементов
        // стало на 1 меньше
        //или выведем с помощью лямбда выражения
        System.out.println();
        System.out.print("Теперь массив такой: ");
        arr.forEach((t) -> System.out.print(t + "  "));

        System.out.println();
        System.out.println(arr.remove(new Integer(5))); // выводит (с помощью System.out.print) true,
        // если элемент со значением 5 есть (только первый найденный, если их несколько), а сам метод его удаляет.
        System.out.print("Теперь массив такой: ");
        arr.forEach((t) -> System.out.print(t + "  "));

        System.out.println();
        arr.set(1,5);// заменяет объект с индексом 1 на объект со значением 5.
        System.out.print("Теперь массив такой: ");
        arr.forEach((t) -> System.out.print(t + "  "));

        //сортировка массива
        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t, Integer t1) {
                return t - t1;
            }
        });
        System.out.println();
        System.out.println();
        System.out.println("\t\tОтсортировали по возрастанию значения элементов.");
        System.out.print("Теперь массив такой: ");
        arr.forEach((t) -> System.out.print(t + "  "));

        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t, Integer t1) {
                return t1 - t;
            }
        });
        System.out.println();
        System.out.println("\t\tОтсортировали по убыванию значения элементов.");
        System.out.print("Теперь массив такой: ");
        arr.forEach((t) -> System.out.print(t + "  "));
    }
}
