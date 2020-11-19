import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class CalendarAndDays {
    public static void main(String[] args) throws ParseException {
        // создаётся объект класса SimpleDateFormat, задающий формат вывода даты в виде дни дополненные нулями,
        // месяцы, дополненные нулями и год из 4 цифр.
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Введите дату рождения в формате dd.MM.yyyy: ");
        // создаётся экземпляр класса Calendar с использованием текущего часового пояса и локализации.
        Calendar dr = Calendar.getInstance();
        // устанавливается время по формату из введенной строки
        // (не знал, что так можно писать (new Scanner(System.in).nextLine())))
        dr.setTime(simpleDateFormat.parse(new Scanner(System.in).nextLine()));

        //видимо создается второй объект для сравнения с первым и ему задается тоже самое.
        // Не понятно только почему локализация здесь есть, а там нет.
        Calendar now = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy - EEEE", new Locale("ru"));

        //в цикле выводится то, что требуется
        for (int i = 0; dr.before(now); i++) {
            //simpleDateFormat.format(dr.getTime())); в жизни бы не додумался и до сих пор не уяснил логику
            // Я понимаю, что здесь написано, но повторить не смогу. Поскольку в голове каша от этого синтаксиса
            // данного класса.
            System.out.println("Возраст: " + i + " Дата: " + simpleDateFormat.format(dr.getTime()));

            //добавляет или вычитает указанное количество времени
            // к данному календарному полю (в данном случае ГОД) видимо потому что нельзя написать переменная++.
            // Мне в основном было не понятно как здесь применить цикл, чтобы условие продолжения цикла
            // изменялось и в конце концов закончилось. Поэтому смысл применения метода before я не мог понять.
            // Теперь ясно.
            dr.add(Calendar.YEAR, 1);
        }
    }

    }

