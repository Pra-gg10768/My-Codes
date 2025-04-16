import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserInterface {
	
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the date");
		String date = sc.nextLine();
		
		SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		
		try {
            Date dateObj = dateFormat.parse(date);
            System.out.println(date+" is a valid date");
        } catch (ParseException e) {
            System.out.println(date+" is not a valid date");
        }
	
	}

}
