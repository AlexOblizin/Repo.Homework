import lombok.Data;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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

    public int getYearFromField(Date date2Convert) {
        return date2Convert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate().getYear();
    }



    public String toString()
    {
        return name + " - " + salary + " - " +
            (new SimpleDateFormat("dd.MM.yyyy")).format(workStart);
    }
}
