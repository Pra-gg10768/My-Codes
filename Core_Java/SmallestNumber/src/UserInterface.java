import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		String result = (num1==num2 && num2 == num3)?"All numbers are equal":(num1<=num2 && num1<=num3)?"The smallest number is "+num1:
			(num2<=num1 && num2<=num3)?"The smallest number is "+num2:"The smallest number is "+num3;
		
		System.out.println(result);
	}

}
