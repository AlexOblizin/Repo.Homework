import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class CalendarAndDays {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Введите дату рождения в формате dd.MM.yyyy: ");
        
        Calendar dr = Calendar.getInstance();
        
        dr.setTime(simpleDateFormat.parse(new Scanner(System.in).nextLine()));

        
        Calendar now = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy - EEEE", new Locale("ru"));

        
        for (int i = 0; dr.before(now); i++) {
        
            System.out.println("Возраст: " + i + " Дата: " + simpleDateFormat.format(dr.getTime()));

        
            dr.add(Calendar.YEAR, 1);
        }
    }

    }

