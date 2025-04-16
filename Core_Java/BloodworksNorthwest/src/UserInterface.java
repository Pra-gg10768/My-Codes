import java.util.Scanner;
public class UserInterface 
{
	public static void main(String args[]) 
	{
	
		Scanner sc =new Scanner(System.in);	
		
		System.out.println("Enter the name");
		String name = sc.nextLine();
		
		System.out.println("Enter the age");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the gender");
		String gender = sc.nextLine();
		
		System.out.println("Enter the blood group");
		String blood = sc.nextLine();
		
		System.out.println("Enter the phone no");
		long phone = sc.nextLong();
		DonorDetails dd = new DonorDetails(name, age,gender,blood,phone);
		
		System.out.println("Name:"+dd.getName());
		System.out.println("Age:"+dd.getAge());
		System.out.println("Gender:"+dd.getGender());
		System.out.println("Blood group:"+dd.getBloodGroup());
		System.out.println("Phone no:"+dd.getPhoneNumber());

	}

}
