import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the day");
		int day = sc.nextInt();
		if (day<=0 || day>30) {
			System.out.println(day+" is invalid day");
		}else {
			int num1 = 0, num2 = 1, egg = 0;
			for(int i = 1;i<=day;i++) {
				egg = 2*num2 + num1;
				num1 = num2;
				num2 = egg;
			}
			System.out.println("Number of eggs in "+day+"th day is "+num1);
		}
	}

}
