import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();	
		//counting digits
		int temp1 = num, sum = 0;
		while (temp1 !=0) {
			sum+=1;
			temp1/=10;
		}
		
		//main logic
		if (sum>3) {
			int revnum = 0, temp = num;
			while (temp!=0) {
				revnum = revnum*10 + temp%10;
				temp/=10;
			}
			System.out.println("Reversed number is "+revnum);
			
			
			int placeValue = (int) Math.pow(10, sum - 1); 
            boolean firstTerm = true; 
            temp = revnum; 
            while (temp != 0) {
                int digit = temp / placeValue;
                if (digit != 0) { 
                    if (!firstTerm) {
                        System.out.print("+");
                    }
                    System.out.print(digit * placeValue);
                    firstTerm = false;
                }
                temp %= placeValue; 
                placeValue /= 10; 
            }
            
        } else {
            System.out.println(num + " is an invalid number");
    
		}
		
	}

}
