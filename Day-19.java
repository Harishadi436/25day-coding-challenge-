import java.util.Scanner;

public class AddOneToElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        
        int[] userArray = new int[size];

        
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            userArray[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < size; i++) {
            userArray[i] += 1;
        }

        
        System.out.println("\nUpdated array (adding 1 to each element):");
        for (int i = 0; i < size; i++) {
            System.out.print(userArray[i] + " ");
        }

       
        scanner.close();
    }
}
