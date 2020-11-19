import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введите радиус круга: ");
        Scanner scanRadCrc = new Scanner(System.in);
        double radCrc = scanRadCrc.nextDouble();

        System.out.println("Площадь круга с радиусом " +
                Math.abs(radCrc) + " равна: " + GeometryCalculator.getCircleSquare(radCrc));

        /*System.out.println("Circle Square");
        System.out.println(GeometryCalculator.getCircleSquare(3d));
        System.out.println(GeometryCalculator.getCircleSquare(-5));
        System.out.println(GeometryCalculator.getCircleSquare(6.56));*/

        System.out.print("Введите радиус сферы: ");
        Scanner scanRadSph = new Scanner(System.in);
        double radSph = scanRadSph.nextDouble();

        System.out.println("Объем сферы с радиусом " +
                Math.abs(radSph) + " равен: " + GeometryCalculator.getSphereVolume(radSph));

        /*System.out.println("\nSphere Volume");
        System.out.println(GeometryCalculator.getSphereVolume(1d));
        System.out.println(GeometryCalculator.getSphereVolume(57.6));
        System.out.println(GeometryCalculator.getSphereVolume(0));*/

        System.out.print("Введите сторону a: ");
        Scanner scanA = new Scanner(System.in);
        double aSc = scanA.nextDouble();

        System.out.print("Введите сторону b: ");
        Scanner scanB = new Scanner(System.in);
        double bSc = scanB.nextDouble();

        System.out.print("Введите сторону с: ");
        Scanner scanC = new Scanner(System.in);
        double cSc = scanC.nextDouble();

        System.out.println("Площадь трeугольника со сторонами: " + aSc + " + " + bSc + " + " + cSc
                + " равна: " + GeometryCalculator.getTriangleSquare(aSc,bSc,cSc));

        /*System.out.println("\nis Triangle Right");
        System.out.println(GeometryCalculator.isTriangleRightAngled(0, 0, 0));
        System.out.println(GeometryCalculator.isTriangleRightAngled(1, 2, 3));
        System.out.println(GeometryCalculator.isTriangleRightAngled(5, 5, 11));*/

        /*System.out.println("\nTriangle Square");
        System.out.println(GeometryCalculator.getTriangleSquare(4.0, 10.0, 5.0));
        System.out.println(GeometryCalculator.getTriangleSquare(7.0, 7.0, 8.10));
        System.out.println(GeometryCalculator.getTriangleSquare(4.0, 7.0, 8.10));*/

    }
}
