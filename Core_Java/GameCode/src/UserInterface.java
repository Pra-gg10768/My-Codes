import java.util.Scanner;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your profile code");
        String code = sc.next();
        if (code.length() != 8) {
            System.out.println(code + " does not have the specified length");
            return;
        }
        if (!code.startsWith("#")) {
            System.out.println(code + " does not start with a valid special character");
            return;
        }
        String uppercasePart = code.substring(1, 5);
   
        if (!uppercasePart.matches("[A-Z]{4}")) {
            System.out.println("1 is an invalid number for uppercase character");
            return;
        }
        String digitPart = code.substring(5, 8);
        if (!digitPart.matches("[0-9]{3}")) {
            System.out.println("2 is an invalid number for digits");
            return;
        }
        System.out.println(code + " is a valid profile code whose last 3 digits are " + digitPart);
    }
}