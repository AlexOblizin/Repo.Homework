package JokerInterfaceKotoPesJava8.src;

public interface Dog {
    default void bark(){
        System.out.println("Barking...");
    }
}
