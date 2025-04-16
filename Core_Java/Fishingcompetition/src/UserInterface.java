import java.util.Scanner;

public class UserInterface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the details");
        String input = sc.nextLine();       
        String[] details = input.split(":");     
        String name = details[0];
        int age = Integer.parseInt(details[1]);
        int bigFish = Integer.parseInt(details[2]);
        int mediumFish = Integer.parseInt(details[3]);
        int smallFish = Integer.parseInt(details[4]);        
        if (age < 18) {
            System.out.println(age + " is an invalid age");
            return;
        }       
        if (bigFish < 0 || mediumFish < 0 || smallFish < 0) {
            System.out.println((bigFish < 0 ? bigFish : mediumFish < 0 ? mediumFish : smallFish) + " is an invalid input");
            return;
        }        
        int points = (bigFish * 10) + (mediumFish * 6) + (smallFish * 3); 
        System.out.println(name + " scored " + points + " points");

    }
}
