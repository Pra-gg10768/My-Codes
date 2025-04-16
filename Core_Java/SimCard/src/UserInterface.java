import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the phone number");
       long num = sc.nextLong();
       long sum_even = 0, sum_odd = 0;
       while (num!=0) {
    	   long temp = num%10;
    	   if (temp%2==0) {
    		   sum_even += temp;
    	   }else {
    		   sum_odd += temp;
    	   }
    	   num/=10;
       }
       if (sum_even == sum_odd) {
    	   System.out.println("Sum of odd and even are equal");
       }
       else if (sum_even > sum_odd) {
    	   System.out.println("Sum of even is greater than sum of odd");
       }
       else if (sum_even < sum_odd) {
    	   System.out.println("Sum of odd is greater than sum of even");
       }

    		 
    }
}