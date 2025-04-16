import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");
        int size = sc.nextInt();

        if (size < 1 || size > 5) {
            System.out.println(size + " is an invalid array size");
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter the numbers");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] <= 0 || arr[i] >= 100) {
                System.out.println(arr[i] + " is an invalid input");
                return;
            }
        }

        boolean found = false;
        StringBuilder result = new StringBuilder();

        for (int num : arr) {
            boolean isPrime = true;
            if (num < 2) isPrime = false;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                int sum = 0;
                int prime = 2;
                boolean isSumOfConsecutivePrimes = false;

                while (sum < num) {
                    boolean primeCheck = true;
                    for (int j = 2; j * j <= prime; j++) {
                        if (prime % j == 0) {
                            primeCheck = false;
                            break;
                        }
                    }
                    if (primeCheck) {
                        sum += prime;
                        if (sum == num) {
                            isSumOfConsecutivePrimes = true;
                            break;
                        }
                    }
                    prime++;
                }

                if (isSumOfConsecutivePrimes) {
                    result.append(num).append("\n");
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("The sum of prime numbers is");
            System.out.print(result);
        } else {
            System.out.println("The " + size + " numbers are not sum of prime numbers");
        }

        sc.close();
    }
}
