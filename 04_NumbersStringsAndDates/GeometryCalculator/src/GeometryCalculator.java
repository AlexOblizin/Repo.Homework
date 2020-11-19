import java.util.Scanner;

public class GeometryCalculator {


    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radCircle)
    {
        double absRadC = Math.abs(radCircle);
        return Math.PI * Math.pow(absRadC,2);
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radSphere) {
        double absRadC = Math.abs(radSphere);
        return (float) 4/3 * Math.PI * Math.pow(absRadC, 3);
    }

    public static boolean isTriangleRightAngled(double a, double b, double c) {
        if ((b + c) > a && (a + c) > b && (a + b) > c) {
            return true;}
        else {
            return false;
        }
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTriangleRightAngled, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        if (isTriangleRightAngled(a,b,c) == true) {
            return Math.sqrt((p * (p - a)*(p - b) * (p - c)));
        }
        else {
            System.out.println("Такого треугольника не бывает.");
            return -1.0;
        }
    }
}
