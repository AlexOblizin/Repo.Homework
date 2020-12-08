import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;

public class TestAirport {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime twoHours = LocalDateTime.now().plusHours(2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm (dd.MM.yyyy)");

        Airport airport = Airport.getInstance();


        airport.getTerminals().stream()
                .flatMap(a -> a.getFlights().stream())
                .filter(b -> {
                    LocalDateTime localDateTime = dateToLocalDate(b.getDate());
                    return localDateTime.isAfter(now) && localDateTime.isBefore(twoHours) && b.getType() == Flight.Type.DEPARTURE;
                })
                .forEach(c -> System.out.println("\"" + c.getAircraft().getModel() + "\"" + " --- " + simpleDateFormat.format(c.getDate())));

    }

    public static LocalDateTime dateToLocalDate(Date date) {
        return date.toInstant().atZone(ZoneOffset.UTC).toLocalDateTime();
    }
}