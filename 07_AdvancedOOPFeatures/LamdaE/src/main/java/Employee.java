import lombok.Data;
import lombok.Getter;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Employee
{
    @Getter private String name;
    @Getter private Integer salary;
    @Getter private Date workStart;

        public Employee(String name, Integer salary, Date workStart)
    {
        this.name = name;
        this.salary = salary;
        this.workStart = workStart;
    }

    public String toString()
    {
        return name + " - " + salary + " - " +
            (new SimpleDateFormat("dd.MM.YYYY")).format(workStart);
    }


}
