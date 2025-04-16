import java.util.Scanner;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the ticket Id");
		long ticket = sc.nextLong();
		
		System.out.println("Enter the unlucky code");
		int code = sc.nextInt();
		
		int sum=0;
		long temp = ticket;
		while(temp!=0) {
			int a = (int) (temp%10);
			if (a==code) {
				sum++;
			}
			temp/=10;
		}
		if (sum>=3) {
			System.out.println(ticket+" is unlucky ticket");
		}
		else if (sum==0) {
			System.out.println(ticket+" is lucky ticket");
		}	
		else if(sum<3) {
			System.out.println(ticket+" is partially lucky");
		}
		
	}
}