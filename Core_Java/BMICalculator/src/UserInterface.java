import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter weight in kg");
		double weight = sc.nextDouble();
		
		System.out.println("Enter height in cm");
		double height = sc.nextDouble();
		
		double heightInMeters = height/100.0;
		
		double BMI = weight/(heightInMeters * heightInMeters);
		
		if (BMI>25) {
			double reduce = BMI-25;
			System.out.printf("Your BMI is %.2f. You are overweight\n", BMI);
			System.out.printf("Reduce %.2f kg to be fit\n",reduce);
		}
		else if (BMI>=18.5 && BMI<=25) {
			System.out.printf("Your BMI is %.2f. You are fit and healthy", BMI);
		}
		else {
			double gain = 18.5-BMI;
			System.out.printf("Your BMI is %.2f. You are underweight\n", BMI);
			System.out.printf("Gain %.2f kg to be fit\n",gain);
		}
		
	}

}
