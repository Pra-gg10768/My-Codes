import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UserInterface {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date of joining");
        String inputDate = sc.nextLine();
        sc.close();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date joiningDate = dateFormat.parse(inputDate);
            Date currentDate = dateFormat.parse("15/12/2020");
            long differenceInMillis = currentDate.getTime() - joiningDate.getTime();
            long yearsOfExperience = TimeUnit.MILLISECONDS.toDays(differenceInMillis) / 365;         
            System.out.println(yearsOfExperience + " years of experience");
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter date in dd/MM/yyyy format.");
        }
	
	}

}
