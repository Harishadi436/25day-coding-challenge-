import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

       
        Map<Character, Integer> characterCountMap = countCharacters(inputString);

        
        System.out.println("Character count in the string:");

        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();
            System.out.println("'" + character + "': " + count + " times");
        }

        
        scanner.close();
    }

    private static Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> characterCountMap = new HashMap<>();

       
        for (char character : str.toCharArray()) {
            
            characterCountMap.put(character, characterCountMap.getOrDefault(character, 0) + 1);
        }

        return characterCountMap;
    }
}
