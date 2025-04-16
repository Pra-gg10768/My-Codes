import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
    	Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the array size");
        int size = sc.nextInt();
       
        if (size<=0) {
            System.out.println(size+" is an invalid array size");
        } else if(size%2!=0) {
            System.out.println(size+" is an odd number. Please enter even number");
        } else {
            int[] array = new int[size];
            System.out.println("Enter the number");
            for(int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }          
            int temp, sum, max = 0;
            for(int i = 0; i < array.length; i++) {
                for(int j = i+1; j < array.length; j++) {
                    if(array[j] < array[i]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }           
            for(int i = 0; i < (array.length)/2; i++) {
                sum = array[i] + array[array.length - 1 - i];
                if(max < sum) {
                    max = sum;
                }
            }
            System.out.println("The maximum number is " + max);
        }
       
    }
}