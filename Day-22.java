import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter your birth day (1-31): ");
        int birthDay = scanner.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        
        System.out.print("Enter the current day (1-31): ");
        int currentDay = scanner.nextInt();

        System.out.print("Enter the current month (1-12): ");
        int currentMonth = scanner.nextInt();

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        
        scanner.close();

       
        int age = calculateAge(birthDay, birthMonth, birthYear, currentDay, currentMonth, currentYear);


        System.out.println("Your age is: " + age + " years");
    }

  
    private static int calculateAge(int birthDay, int birthMonth, int birthYear,
                                    int currentDay, int currentMonth, int currentYear) {
        int age = currentYear - birthYear; // Initialize age with the difference in years


        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--; // Decrement age if the birthdate hasn't occurred yet in the current year
        }

        return age;
    }
}
