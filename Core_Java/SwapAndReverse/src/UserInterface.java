import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();

        if (!sentence.matches("[a-zA-Z ]+")) {
            System.out.println(sentence + " is an invalid sentence");
            return;
        }
        String[] words = sentence.split(" ");

        if (words.length <= 2) {
            System.out.println("Invalid Length");
            return;
        }
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        words[0] = lastWord;
        words[words.length - 1] = firstWord;

        StringBuilder middlePart = new StringBuilder();
        for (int i = 1; i < words.length - 1; i++) {
            middlePart.append(words[i]).append(" ");
        }
        if (middlePart.length() > 0) {
            middlePart.deleteCharAt(middlePart.length() - 1);
        }

        String reversedMiddlePart = new StringBuilder(middlePart.toString()).reverse().toString();

        String result = words[0] + " " + reversedMiddlePart + " " + words[words.length - 1];

        System.out.println(result);
    }
}