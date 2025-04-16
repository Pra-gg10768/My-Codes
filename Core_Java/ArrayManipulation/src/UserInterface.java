import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    public String getDuplicateElement() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the size of an array");
            int size = sc.nextInt();
            if (size < 0) throw new NegativeArraySizeException();

            int[] array = new int[size];
            System.out.println("Enter the array elements");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            System.out.println("Enter the position of the element to be replicated");
            int index = sc.nextInt();

            StringBuilder result = new StringBuilder("The array elements are");
            for (int num : array) {
                result.append(" ").append(num);
            }
            result.append(" ").append(array[index]);
            return result.toString();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Array index is out of range";
        } catch (InputMismatchException e) {
            return "Input was not in the correct format";
        } catch (NegativeArraySizeException e) {
            return "Array size should be positive";
        }
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        System.out.println(ui.getDuplicateElement());
    }
}
