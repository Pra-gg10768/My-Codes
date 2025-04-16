import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        NumAvg numAvg = new NumAvg();

        while (true) {
            System.out.println("1.Add number\n2.Find average\n3.Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter the number");
                int num = sc.nextInt();   
                numAvg.addNum(num);
                
            } else if (choice == 2) {
                double avg = numAvg.calAvg();
                if (avg == -1) {
                    System.out.println("The set is empty");
                } else {
                    System.out.println(avg);
                }
            } else if (choice == 3) {
                System.out.println("Thank you for using the application");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
	}
}
