import java.util.Scanner;

class ArrayOperations {
    private int[] array1;
    private int[] array2;
    private int[] array3;

    public ArrayOperations(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
        this.array3 = new int[array1.length]; 
    }

    public void performOperations() {
        if (array1.length != array2.length) {
            System.out.println("Both array size are not the same");
            return; 
        }

        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0) {
                array3[i] = array1[i] + array2[i];
            } else { 
                array3[i] = array1[i] - array2[i];
            }
        }

        System.out.println("The elements of the third array");
        for (int value : array3) {
            System.out.println(value);
        }
    }
}

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size for the first array");
        int size1 = scanner.nextInt();
        if (size1 <= 0) {
            System.out.println(size1 + " is an invalid array size");
            return;
        }

        int[] array1 = new int[size1];
        System.out.println("Enter the elements for the first array");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the size for the second array");
        int size2 = scanner.nextInt();
        if (size2 <= 0) {
            System.out.println(size2 + " is an invalid array size");
            return; 
        }

        int[] array2 = new int[size2];
        System.out.println("Enter the elements for the second array");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        ArrayOperations operations = new ArrayOperations(array1, array2);
        operations.performOperations();
    }
}