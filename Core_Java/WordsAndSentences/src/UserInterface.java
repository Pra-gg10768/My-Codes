import java.util.Scanner;

public class UserInterface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();
        System.out.println("Enter the word");
        String word = sc.nextLine();
        if (sentence.contains(word)) {
            System.out.println(word + " is present in the sentence");
        } else {
            System.out.println(word + " is not present in the sentence");
        }
    }
}
