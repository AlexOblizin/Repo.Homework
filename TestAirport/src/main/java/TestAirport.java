import com.skillbox.airport.*;



public class TestAirport {
    public static void main(String[] args)
    {
    Airport airport = Airport.getInstance();

    //похоже список рандомный, как по названиям так и по количеству самолётов
    System.out.println("Список самолетов в аэропорту: \n" + airport.getAllAircrafts()); //вывод в одну
                                                                                       // некрасивую, длинную строчку)
    System.out.println();
    System.out.println("Количество самолетов в аэропорту: " + airport.getAllAircrafts().size() + "\n");

    //а так выведу красиво - сверху вниз)
    for (Aircraft element : airport.getAllAircrafts())
    {
        System.out.println(element);
    }
    System.out.println("Количество самолетов в аэропорту: " + airport.getAllAircrafts().size());





    }
}
