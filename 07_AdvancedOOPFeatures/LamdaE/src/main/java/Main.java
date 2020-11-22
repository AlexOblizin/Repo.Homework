import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    private static String staffFile = "data/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args) {

        List<Employee> staff = loadStaffFromFile();

        staff.stream().sorted((o1, o2) -> {

            int str = o1.getSalary().compareTo(o2.getSalary());

            if (str == 0) {
                return o1.getName().compareTo(o2.getName());
            }
            else {
                return str;
            }

        }).forEach(System.out::println);

    }

    private static List<Employee> loadStaffFromFile() {

        List<Employee> staff = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for (String line : lines) {
                String[] fragments = line.split("\t");
                if (fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(
                        fragments[0],
                        Integer.parseInt(fragments[1]),
                        (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                ));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }
}
