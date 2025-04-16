import java.util.Scanner;

public class UserInterface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of arguments is " + 2);
        System.out.println("Total " + addition(10, 15));

        System.out.println("Number of arguments is " + 3);
        System.out.println("Total " + addition(10, 20, 30));

        System.out.println("Number of arguments is " + 6);
        System.out.println("Total " + addition(10, 30, 60, 100, 5, 15));
    }

    public static int addition(int... a) {
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return sum;
    }
}
