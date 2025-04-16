import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		
		int revnum = 0, tempnum = num;
		while(tempnum !=0) {
			revnum = revnum*10 + tempnum % 10;
			tempnum/=10;
		}
		if (num % 10 ==0) {
			revnum = num;
		}

		while(revnum!=0) {
			int temp = revnum%10;
			switch(temp) {
			case 0:
				System.out.print("zero ");
				break;
			case 1:
				System.out.print("one ");
				break;
			case 2:
				System.out.print("two ");
				break;
			case 3:
				System.out.print("three ");
				break;
			case 4:
				System.out.print("four ");
				break;
			case 5:
				System.out.print("five ");
				break;
			case 6:
				System.out.print("six ");
				break;
			case 7:
				System.out.print("seven ");
				break;
			case 8:
				System.out.print("eight ");
				break;
			case 9:
				System.out.print("nine ");
				break;				
			}
			revnum /=10;
		}
		
	}

}
