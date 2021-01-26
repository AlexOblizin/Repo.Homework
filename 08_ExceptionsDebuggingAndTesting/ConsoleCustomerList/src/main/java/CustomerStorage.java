import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerStorage {
    private HashMap<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {

        String[] components = data.split("\\s+");
        String name = components[0] + " " + components[1];
        try {
            if (!Validation.emailValid(components[2])) {
                throw new IncorrectEmailException("e-mail wrong format!");
            } else if (!Validation.phoneValid(components[3])) {
                throw new IncorrectPhoneNumberException("Phone wrong format! Right phone format only is +71234567890");
            }

        } catch (IncorrectEmailException e) {
            e.printStackTrace();

        } catch (IncorrectPhoneNumberException e) {
            e.printStackTrace();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Wrong format!");

        }
        if (Validation.emailValid(components[2]) && Validation.phoneValid(components[3])) {
            storage.put(name, new Customer(name, components[3], components[2]));
        }
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public int getCount() {
        return storage.size();
    }

}