import java.util.*;

public class UserInterface{
    
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first array size");
        int size1 = sc.nextInt();
       
        if (size1 <= 0) {
            System.out.println(size1 + " is an invalid array size");
        } else {
            System.out.println("Enter the numbers");
            int[] arr1 = new int[size1];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.nextInt();
            }

            System.out.println("Enter the second array size");
            int size2 = sc.nextInt();
           
            if (size2 <= 0) {
                System.out.println(size2 + " is an invalid array size");
            } else if (size2 > size1) {
                System.out.println(size2 + " is an invalid size as it is greater than first array size " + size1);
            } else {
                System.out.println("Enter the numbers");
                int[] arr2 = new int[size2];
                for (int j = 0; j < arr2.length; j++) {
                    arr2[j] = sc.nextInt();
                }

                Arrays.sort(arr1);
                Arrays.sort(arr2);

                int flag = 1;
                for (int k = 0; k < arr2.length; k++) {
                    boolean found = false;
                    for (int m = 0; m < arr1.length; m++) {
                        if (arr2[k] == arr1[m]) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        flag = 0;
                        break;
                    }
                }

                if (flag == 1) {
                    System.out.println("Array2 of size " + size2 + " is a subset of array1");
                } else {
                    System.out.println("Array2 of size " + size2 + " is not a subset of array1");
                }
            }
        }     
    }
}