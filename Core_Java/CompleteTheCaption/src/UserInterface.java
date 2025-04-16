import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Length of the strings " + str1 + " and " + str2 + " does not match");
        } else if (!str1.matches("[a-zA-Z! ]+") && !str2.matches("[a-zA-Z! ]+")) {
            System.out.println(str1 + " and " + str2 + " contains invalid symbols");
        } else if (!str1.matches("[a-zA-Z! ]+")) {
            System.out.println(str1 + " contains invalid symbols");
        } else if (!str2.matches("[a-zA-Z! ]+")) {
            System.out.println(str2 + " contains invalid symbols");
        } else {
            char[] result = str1.toCharArray();
            for (int i = 0; i < result.length; i++) {
                if (result[i] == '!') {
                    result[i] = str2.charAt(i);
                }
            }
            System.out.println(new String(result));
        }
        sc.close();
    }
}
