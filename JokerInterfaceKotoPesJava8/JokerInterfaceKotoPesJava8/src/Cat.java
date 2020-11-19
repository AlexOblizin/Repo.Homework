package JokerInterfaceKotoPesJava8.src;

public interface Cat {
    default void mew() {
        System.out.println("Meowing...");
    }
}
