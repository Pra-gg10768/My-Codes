import java.util.Scanner;

public class UserInterface {

    public static NumberCategory checkAmicable() {
        return (num1, num2) -> {
            return sumOfDivisors(num1) == num2 && sumOfDivisors(num2) == num1;
        };
    }

    public static NumberCategory checkPalindrome() {
        return (num1, num2) -> {
            int product = num1 * num2;
            return isPalindrome(product);
        };
    }

    private static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        NumberCategory amicableCheck = checkAmicable();
        boolean isAmicable = amicableCheck.checkNumberCategory(num1, num2);

        NumberCategory palindromeCheck = checkPalindrome();
        boolean isPalindrome = palindromeCheck.checkNumberCategory(num1, num2);

        if (isAmicable) {
            System.out.println(num1 + " and " + num2 + " are amicable numbers");
        } else {
            System.out.println(num1 + " and " + num2 + " are not amicable numbers");
        }
        if (isPalindrome) {
            System.out.println("Their product " + (num1 * num2) + " do produces a Palindrome");
        } else {
            System.out.println("Their product " + (num1 * num2) + " does not produce a Palindrome");
        }
    }
}