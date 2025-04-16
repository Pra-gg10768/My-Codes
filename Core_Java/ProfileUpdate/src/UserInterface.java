import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();
        
        if (name.matches("[a-zA-Z ]+")) { 
            System.out.println("Enter your PAN number");
            String pan = sc.nextLine();
            if (pan.length() == 10 && 
                pan.substring(0, 4).matches("[A-Z]{4}") && 
                pan.substring(4, 5).matches("[A-Z]") && 
                pan.substring(5, 9).matches("[0-9]{4}") && 
                pan.substring(9).matches("[A-Z]")) {
                
                System.out.println("Enter your E-mail ID");
                String email = sc.nextLine();
                if (email.matches("^[a-z]{5,10}@digitec\\.com$")) {
                    System.out.println("Profile of " + name + " updated successfully");
                } else {
                    System.out.println("Invalid E-mail ID");
                }
            } else {
                System.out.println(pan + " is an invalid PAN number");
            }
        } else {
            System.out.println("Invalid name");
        }
    }
}
