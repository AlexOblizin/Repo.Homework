import java.util.HashMap;
import java.util.Map;

public class Loader {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0,"Ноль");
        map.put(1,"Один");
        map.put(2,"Два");
        map.put(3,"Три");
        map.put(4,"Четыре");
        map.put(5,"Пять");
        map.put(6,"Шесть");
        map.put(7,"Семь");

        System.out.println(map);



    }
    public static void testMap (Map<Integer, String> map){
        Integer a;
        String b;
        map.put(a,b);
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());

    }
    }


}
