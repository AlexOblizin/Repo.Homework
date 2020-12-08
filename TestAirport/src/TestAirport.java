import com.skillbox.airport.*;

import java.text.SimpleDateFormat;
import java.util.*;

public class TestAirport {

       public static void main(String[] args) {

        Date now = new Date(System.currentTimeMillis());
        Date twoHours = new Date(System.currentTimeMillis() + 7200000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm (dd.MM.yyyy)");

        Airport airport = Airport.getInstance();


        airport.getTerminals().stream()
               .flatMap(a -> a.getFlights().stream())
               .filter(b -> (b.getDate().after(now) && b.getDate().before(twoHours) && b.getType() == Flight.Type.DEPARTURE))
               .forEach(c -> System.out.println("\"" + c.getAircraft().getModel() + "\"" + " --- " + simpleDateFormat.format(c.getDate())));

    }
}
