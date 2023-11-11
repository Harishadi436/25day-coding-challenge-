import java.util.Scanner;

public class RupeesToDollarsConverter {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in rupees: ");

       
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric value for rupees.");
            scanner.next(); 
            System.out.print("Enter the amount in rupees: ");
        }

        double rupees = scanner.nextDouble();

     
        double conversionRate = 0.012;

        
        double dollars = rupees * conversionRate;

       
        System.out.println(rupees + " Rupees is equal to " + dollars + " Dollars.");

       
        scanner.close();
    }
}
