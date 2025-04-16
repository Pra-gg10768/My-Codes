import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of chances");
        int chances = scanner.nextInt();

        if (chances < 1 || chances > 5) {
            System.out.println("Your chance " + chances + " is out of range(1-5)");
            return;
        }

        int sum = 0;
        System.out.println("Enter the numbers");

        for (int i = 0; i < chances; i++) {
            int num1 = scanner.nextInt();
            if (num1 <= 0 || num1 >= 10) {
                System.out.println(num1 + " is an invalid number");
                return;
            }

            int num2 = scanner.nextInt();
            if (num2 <= 0 || num2 >= 10) {
                System.out.println(num2 + " is an invalid number");
                return;
            }

            sum += num1 + num2;
        }

        boolean isPrime = sum > 1;
        for (int i = 2; i * i <= sum && isPrime; i++) {
            if (sum % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("The sum " + sum + " is a prime number.You won the game");
        } else {
            System.out.println("The sum " + sum + " is not a prime number.Better luck next time");
        }
    }
}
