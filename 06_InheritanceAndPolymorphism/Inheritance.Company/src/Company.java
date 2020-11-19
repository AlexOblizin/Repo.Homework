import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {

    private final double min = 9500000.00;
    private final double max = 10500000.00;
    private final int income = (int) (min + (int) (Math.random() * (max - min) + 100));

    private final List<Employee> employees = new ArrayList<>();

    private final SalaryComparator salaryComparator = new SalaryComparator();

    public int getIncome() {
        return income;
    }

    public void hire(Employee employee) {
        employee.setCompany(this);
        employees.add(employee);
    }

    public void hireAll(List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            hire(employees.get(i));
        }
    }

    public void fire(int howMuch) {
        int countForRemove = (int)(employees.size() / 100.0 * howMuch);
        Random rand = new Random();
        for (int i = 0; i < countForRemove; i++) {
            Employee randomEmployee = employees.get(rand.nextInt(employees.size()));
            employees.remove(randomEmployee);
        }
    }

    public void getLowestEmployees(int number) {
        if (number <= employees.size() && number > 0) {
            employees.sort(salaryComparator);
            System.out.println("Список из " + number + " самых низких зарплат в компании:");
            for (int i = 1; i <= number; i++) {
                System.out.println(employees.get(i).getMonthSalary() + " руб");
            }
        } else {
            System.out.println("Неверный ввод");
        }
    }

    public void getTopEmployees(int number) {
        if (number <= employees.size() && number > 0) {
            employees.sort(salaryComparator.reversed());
            System.out.println("Список из " + number + " самых высоких зарплат в компании:");
            for (int i = 1; i <= number; i++) {
                System.out.println(employees.get(i).getMonthSalary() + " руб");
            }
        } else {
            System.out.println("Неверный ввод");
        }
    }
}
