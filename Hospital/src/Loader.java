import java.math.BigDecimal;
import java.math.RoundingMode;

public class Loader {
    public static final int PATIENTS_COUNT = 30;
    public static final float MIN_T_PATIENT = 32f;
    public static final float MAX_T_PATIENT = 40f;
    public static final float MIN_T_HEALTHY_PATIENT = 36.20f;
    public static final float MAX_T_HEALTHY_PATIENT = 36.90f;

    public static void main(String[] args) {
        float[] listOfPatients = new float[PATIENTS_COUNT];
        int countHealthy = 0;
        float sum = 0;
        for (int i = 0; i < listOfPatients.length; i++) {

            listOfPatients[i] = MIN_T_PATIENT + (float) (Math.random() * (MAX_T_PATIENT - MIN_T_PATIENT));

            System.out.println("Температура пациента: " + new BigDecimal(listOfPatients[i])
                    .setScale(2,RoundingMode.HALF_UP) + "\u00B0"); //округлим до 2х знаков после запятой
            // в сторону повышения по правилам математики.

            if (listOfPatients[i] >= MIN_T_HEALTHY_PATIENT && listOfPatients[i] <= MAX_T_HEALTHY_PATIENT){
                countHealthy++;
            }

            sum += listOfPatients[i];
        }

        sum /= listOfPatients.length;

        System.out.println("Средняя температура по больнице: " + new BigDecimal(sum)
                .setScale(2,RoundingMode.HALF_UP) + "\u00B0");
        System.out.println("Нормальная температура у " + countHealthy + " пациентов.");
    }
}
