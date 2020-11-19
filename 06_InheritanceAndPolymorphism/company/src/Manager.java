import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Manager implements Employee {
    String setId;
    String name;
    int salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Manager() {
        this.setId = "менеджер";
        this.setName(Tools.nameSurnameGenerator());
        this.setSalary(this.getMonthSalary());
    }



    @Override
    public int getMonthSalary() {

        Random randomSalary = new Random();

        int salary = randomSalary.nextInt(25001) + 56000;

        salary += ((incomeForCompanyByManager() / 100) * 5);

        return salary;
    }

    public static int incomeForCompanyByManager() {

        Random randomIncome = new Random();
        int income = randomIncome.nextInt(25001) + 115000;

        return income;
    }

}
