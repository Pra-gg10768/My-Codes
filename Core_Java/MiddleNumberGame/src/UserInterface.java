import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        if (size <= 0 || size > 10) {
            System.out.println("Please enter a valid number");
            sc.close();
            return;
        }
        if (size % 2 == 0) {
            System.out.println("Please enter an odd number");
            sc.close();
            return;
        }

        System.out.println("Enter the elements");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] <= 0 || arr[i] > 10) {
                System.out.println("Please enter valid elements in the array");
                sc.close();
                return;
            }
        }

        if (size == 1) {
            System.out.println("The sum of the values is 0");
            System.out.println("The product of the values is 0");
            sc.close();
            return;
        }

        // Find the middle index
        int mid = size / 2;
        int sum = 0, product = 1;


        if (arr[mid] % 2 == 0) { 
            for (int i = 0; i < mid; i++) {
                sum += arr[i]; 
            }
            for (int i = mid + 1; i < size; i++) {
                product *= arr[i]; 
            }
        } else { 
            for (int i = 0; i < mid; i++) {
                product *= arr[i]; 
            }
            for (int i = mid + 1; i < size; i++) {
                sum += arr[i]; 
            }
        }
        System.out.println("The sum of the values is " + sum);
        System.out.println("The product of the values is " + product);

    }
}
