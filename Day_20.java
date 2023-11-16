import java.util.Scanner;

public class CubeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the cube: ");
        double sideLength = scanner.nextDouble();

        double volume = calculateVolume(sideLength);

        double surfaceArea = calculateSurfaceArea(sideLength);

        System.out.println("\nCube Information:");
        System.out.println("Side Length: " + sideLength);
        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);

        scanner.close();
    }

    private static double calculateVolume(double sideLength) {
        return Math.pow(sideLength, 3);
    }

    private static double calculateSurfaceArea(double sideLength) {
        return 6 * Math.pow(sideLength, 2);
    }
}
