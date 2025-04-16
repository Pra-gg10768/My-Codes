import java.util.Scanner;
import java.util.Arrays;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();
        if (!sentence.matches("[a-z ]+")) {
            System.out.println(sentence + " is an invalid input");
        } else {
            String[] words = sentence.split(" ");
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                char[] charArray = word.toCharArray();
                Arrays.sort(charArray);
                result.append(new String(charArray)).append(" ");
            }

            System.out.println(result.toString().trim());
        }

    }
}
