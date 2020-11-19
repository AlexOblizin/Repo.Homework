package SupplierHello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        new Test().run();

        List<String> arrayList = new ArrayList<>(Arrays.asList("Arne", "Chuck", "Slay"));
        arrayList.removeIf("Chuck"::equals);
        arrayList.forEach(x -> System.out.print(x + " "));


//      NPE потому что:
//      stream().forEach() --> spliterator().forEachRemaining()
//      forEachRemaining() проверяет modcount один раз в конце
//      удаление элемента приведёт к сдвигу массива с добавлением null в конце
//      ["Arne", "Chuck", "Slay"] превратится в ["Arne", "Slay", null]
//      и поэтому на последней итерации цикла if (x.equals("Chuck")) упадёт с NPE и не дотянет до ConcurrentModificationException


//        List<String> list = new ArrayList<>(Arrays.asList("Arne", "Chuck", "Slay"));
//        list.stream().forEach(x -> {
//            if (x.equals("Chuck")) {
//                list.remove(x);
//            }
//        });

    }
}

class Test {
    String str;

    void run() {
        str = "привет";
        Supplier<String> s1 = str::toUpperCase;
        Supplier<String> s2 = () -> str.toUpperCase();
        str = "hello";
        System.out.println(s1.get());
        System.out.println(s2.get());
    }


}
