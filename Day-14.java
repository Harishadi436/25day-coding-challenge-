import java.util.Scanner;

class RemovingLastDigits {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = scr.nextInt();
        
       
            int b = a % 10;
            a = a / 10; 
            System.out.println(a);
     
        
        scr.close(); 
    }
}
