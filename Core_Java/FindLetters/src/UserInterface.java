import java.util.*;
public class UserInterface{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.nextLine();

        System.out.println("Enter the two indices");
        int a = sc.nextInt();
        if (a >= word.length()) {
            System.out.println(a + " is greater than the word length");
            sc.close();
            return;
        }
        int b = sc.nextInt();
        sc.close();

        if (b > word.length()) { 
            System.out.println(b + " is greater than the word length");
        } else if (b <= a) {
            System.out.println("Index2 should be greater than Index1");
        } else {
            System.out.println(word.substring(a, b));
        }
		
		
	}
}
