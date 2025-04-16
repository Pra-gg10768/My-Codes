import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
    	 Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int number = sc.nextInt();
         sc.close();

         if (number < 10 || number > 99) {
             System.out.println("Invalid number");
             return;
         }

         int firstDigit = number / 10;
         int secondDigit = number % 10;
         
         if (number > 50) {
             System.out.println(firstDigit - secondDigit);
         } else {
             int reversedNumber = secondDigit * 10 + firstDigit;
             int reversedFirstDigit = reversedNumber / 10;
             int reversedSecondDigit = reversedNumber % 10;
             System.out.println(reversedFirstDigit - reversedSecondDigit);
         }
    }
}