import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of PIN numbers");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(n + " is an invalid number");
            return;
        }

        System.out.println("Enter the PIN numbers");
        boolean validFound = false;
        StringBuilder validPins = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int pin = sc.nextInt();

            if (pin < 1000 || pin > 9999) {
                System.out.println(pin + " is an invalid PIN number");
                continue;
            }
 
            int d1 = (pin / 1000) % 10; 
            int d2 = (pin / 100) % 10;  
            int d3 = (pin / 10) % 10;   
            int d4 = pin % 10;          

            boolean isOdd = (d1 % 2 != 0);
            boolean isEven = (d2 % 2 == 0);

            boolean isPrime = true;
            if (d3 < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= d3; j++) {
                    if (d3 % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            boolean isComposite = false;
            if (d4 > 1) {
                for (int j = 2; j < d4; j++) {
                    if (d4 % j == 0) {
                        isComposite = true;
                        break;
                    }
                }
            }

            if (isOdd && isEven && isPrime && isComposite) {
                validPins.append(pin).append("\n");
                validFound = true;
            }
        }

        if (validFound) {
            System.out.println("Valid PIN numbers are");
            System.out.print(validPins);
        } else {
            System.out.println("All these " + n + " numbers are not a valid PIN number");
        }

        sc.close();
    }
}
