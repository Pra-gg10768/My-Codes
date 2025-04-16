import java.util.Scanner;
public class UserInterface {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println(num + " is a negative number");
        } else {
            int sum = 5 * (2 * num + 9);
            System.out.println("The sum of ten numbers is " + sum);
        }
	}
}
