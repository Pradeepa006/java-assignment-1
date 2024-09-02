import java.util.Scanner;

public class QuestionTwo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word to encrypt : ");
        String inputText = scan.nextLine();
        
        System.out.println("Enter the key value : ");
        int keyValue = scan.nextInt();
        
        String encryptedText = encryptText(inputText, keyValue);
       
        System.out.println("Encrypted text: " + encryptedText);
    }
    
    private static String encryptText(String text, int key) {
        StringBuilder encryptedText = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                encryptedText.append(encryptCharacter(ch, key));
            } else {
               
                encryptedText.append(ch);
            }
        }
        
        return encryptedText.toString();
    }
    
    private static char encryptCharacter(char ch, int key) {
        char base = Character.isUpperCase(ch) ? 'A' : 'a';
        int characterValue = Character.toLowerCase(ch) - 'a';
        int encryptedValue = (characterValue + key) % 26;
        char encryptedChar = (char) (base + encryptedValue);
        return Character.isUpperCase(ch) ? Character.toLowerCase(encryptedChar) : Character.toUpperCase(encryptedChar);
    }
}
