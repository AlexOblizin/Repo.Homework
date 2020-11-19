package JokerInterfaceKotoPesJava8.src;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        class KotoPes implements Cat, Dog {
        }

        test(new KotoPes());

    }

    static void test(Object obj) {
        Optional.of((Cat & Dog) obj).ifPresent(a -> {
            ((Cat) a).mew();
            ((Dog) a).bark();
        });
    }
}
