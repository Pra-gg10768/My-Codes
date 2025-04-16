import java.util.Scanner;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();
		
		System.out.println("Enter the number of rooms you needed");
		int room = sc.nextInt();
		while(room<=0) {
			System.out.println("Please enter a valid number");
			room = sc.nextInt();
		}
		
		System.out.println("Enter the phone number");
		long phone = sc.nextLong();
		int amount = room*500;
		
		System.out.println("Pay Rs. "+amount+" for booking\nYour booking has been confirmed");
		
		
		
	}
}