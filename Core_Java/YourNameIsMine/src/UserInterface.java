import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matching the exact prompt format
        System.out.println("Enter the man name");
        String n1 = sc.nextLine().trim();
        System.out.println("Enter the woman name");
        String n2 = sc.nextLine().trim();

        boolean isN1Valid = n1.matches("[a-zA-Z ]+");
        boolean isN2Valid = n2.matches("[a-zA-Z ]+");

        if (!isN1Valid && !isN2Valid) {
            System.out.println("Both " + n1 + " and " + n2 + " are invalid names");
            return;
        } else if (!isN1Valid) {
            System.out.println(n1 + " is an invalid name");
            return;
        } else if (!isN2Valid) {
            System.out.println(n2 + " is an invalid name");
            return;
        }

        int lcsLength = findLongestCommonSubstring(n1, n2);

        boolean isMatch = lcsLength >= Math.min(n1.length(), n2.length()) / 3;

        if (isMatch) {
            System.out.println(n1 + " and " + n2 + " are made for each other");
            System.out.println("Compatibility value is " + lcsLength);
        } else {
            System.out.println(n1 + " and " + n2 + " are not made for each other");
        }

        sc.close();
    }

    private static int findLongestCommonSubSequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1]; 
        int maxSubstringLength = 0; 

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) { 
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxSubstringLength = Math.max(maxSubstringLength, dp[i][j]); 
                } else {
                    maxSubstringLength = Math.max(dp[i-1][j],dp[i][j-1]); 
                }
            }
        }
        return maxSubstringLength;
    }
}
