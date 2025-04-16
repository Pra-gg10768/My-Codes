import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class UserInterface {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Manufacturing Date");
        String manufacturing = sc.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false); 

        Date date;
        try {
            date = dateFormat.parse(manufacturing); 
        } catch (ParseException e) {
            System.out.println(manufacturing + " is not a valid date");
            sc.close();
            return; 
        }

        System.out.println("Enter the Month");
        int months = sc.nextInt();
        sc.close(); 


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, months);


        Date expiryDate = calendar.getTime();
        String expiryDateString = dateFormat.format(expiryDate);

        System.out.println(expiryDateString + " is the expiry date");
	}

}
