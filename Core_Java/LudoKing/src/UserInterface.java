import java.util.Scanner;
public class UserInterface
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Alex points");
		int a = sc.nextInt();
		
		if (a>=0 && a<=50) {
			System.out.println("Enter Nikil points");
			int b = sc.nextInt();
			
			if (b>=0 && b<=50) {
				System.out.println("Enter Sam points");
				int c = sc.nextInt();
				
				if (c>=0 && c<=50) {
					if(a==b || a==c || b==a || b==c) {
						System.out.println("The game is a tie");
					}
					else if(a>b &&a>c){
						System.out.println("Alex scored "+a+" points and won the game");
					}
					else if(b>a && b>c) {
						System.out.println("Nikil scored "+b+" points and won the game");
					}
					else if (c>a && c>b) {
						System.out.println("Sam scored "+c+" points and won the game");
					}				
				}else {
					System.out.println(c+" is an invalid number");
				}
			}
			else {
				System.out.println(b+" is an invalid number");
			}
		}
		else {
			System.out.println(a+" is an invalid number");
		}
		
        
    }
}
