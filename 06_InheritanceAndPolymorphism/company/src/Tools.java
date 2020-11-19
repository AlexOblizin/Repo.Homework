import java.util.Random;

public class Tools {

    static String nameSurnameGenerator() {
        Random randomForNameSurname = new Random();

        Names name = Names.values()[randomForNameSurname.nextInt(314)];
        Surnames surname = Surnames.values()[randomForNameSurname.nextInt(253)];

        String nameSurname = name + " " + surname;

        return nameSurname;
    }

}

