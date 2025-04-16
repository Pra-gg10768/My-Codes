import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the sides");
		int sides = sc.nextInt();

		switch (sides) {
		case 0:
			System.out.println("Enter the radius");
			double radius = sc.nextDouble();
			System.out.printf("Area of the Circle is %.2f", (3.14 * radius * radius));
			break;
		case 3:
			System.out.println("Enter base and height");
			double base = sc.nextDouble();
			double height = sc.nextDouble();
			System.out.printf("Area of the Triangle is %.2f", ((base * height) / 2.0));
			break;
		case 4:
			System.out.println("Enter the length");
			double length = sc.nextDouble();
			System.out.println("Enter the breadth");
			double breadth = sc.nextDouble();
			if (length == breadth) {
				System.out.printf("Area of the Square is %.2f", (length * breadth));
			} else {
				System.out.printf("Area of the Rectangle is %.2f", (length * breadth));
			}
			break;
		default:
			System.out.println("Invalid Side");
		}

	}

}
