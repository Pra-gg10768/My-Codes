import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the height in cm");
		
		float height = sc.nextFloat();
		float feet = height/30.48f;
		
		System.out.printf("Height in feet is %.2f feet",feet);
		
	}

}
