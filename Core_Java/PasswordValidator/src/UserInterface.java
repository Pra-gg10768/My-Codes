import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Generate your password");
        String password = scanner.nextLine();

        if (password.length() < 6 || password.length() > 12) {
            System.out.println(password + " is an invalid password");
        } else {
            boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;
            int lowercaseCount = 0, uppercaseCount = 0, digitCount = 0, specialCharCount = 0;

            for (char c : password.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    hasLower = true;
                    lowercaseCount++;
                } else if (Character.isUpperCase(c)) {
                    hasUpper = true;
                    uppercaseCount++;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                    digitCount++;
                } else if (c == '@' || c == '$' || c == '*' || c == '#') {
                    hasSpecial = true;
                    specialCharCount++;
                }
            }

            if (hasLower && hasUpper && hasDigit && hasSpecial) {
                System.out.println("The generated password " + password + " is valid and has " + 
                                   lowercaseCount + " lowercase alphabet " + 
                                   uppercaseCount + " uppercase alphabet " + 
                                   specialCharCount + " special character " + 
                                   digitCount + " digit");
            } else {
                System.out.println(password + " is an invalid password");
            }
        }
    }
}
