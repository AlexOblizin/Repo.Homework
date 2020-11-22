import lombok.Data;
import lombok.Getter;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class Employee
{
    private String name;
    private Integer salary;
    private Date workStart;

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
