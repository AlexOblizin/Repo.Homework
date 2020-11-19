import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TopManager implements Employee {
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

    public TopManager() {
        this.setId = "ТОП-менеджер";
        this.setName(Tools.nameSurnameGenerator());
        this.setSalary(this.getMonthSalary());

    }

    @Override
    public int getMonthSalary() {
        Random randomSalary = new Random();
        int salary = randomSalary.nextInt(25001) + 56000;

        if (Company.getIncome() > 10000000) {
            salary = salary + ((salary / 100) * 150);
        }

        return salary;
    }

}
