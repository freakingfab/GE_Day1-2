import java.util.Scanner;
public class IsAVowel {
    public static void main(String[] args) {
        // Convert the alphabet to lowercase for case-insensitive comparison
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a char: ");
        char alphabet = scanner.next().charAt(0);
        char lowercaseAlphabet = Character.toLowerCase(alphabet);
        
        // Check if the alphabet is a vowel
        if (lowercaseAlphabet == 'a' || lowercaseAlphabet == 'e' || lowercaseAlphabet == 'i' || lowercaseAlphabet == 'o' || lowercaseAlphabet == 'u') {
            System.out.println("It's a vowel"); 
        } else {
            System.out.println("It's a consonant"); 
        }
    }
}
