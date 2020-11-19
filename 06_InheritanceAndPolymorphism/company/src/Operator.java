import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Operator implements Employee{
    String setId;
    String name;
    int salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Operator(){
        this.setId = "оператор";
        this.setName(Tools.nameSurnameGenerator());
        this.setSalary(this.getMonthSalary());
    }


    @Override
    public int getMonthSalary() {
        Random randomSalary = new Random();
        int salary = randomSalary.nextInt(25001) + 56000;

        return salary;
    }

}
