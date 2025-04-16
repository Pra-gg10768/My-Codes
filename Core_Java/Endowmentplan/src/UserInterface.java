import java.util.Scanner;

public class UserInterface {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		EducationalEndowment ed;
		HealthEndowment hd;
		
		System.out.println("Enter Endowment Id");
		String id = sc.nextLine();
		System.out.println("Enter Holder Name");
		String name = sc.nextLine();
		System.out.println("Enter Endowment type");
		String endowment = sc.nextLine();	
		if(endowment.equalsIgnoreCase("educational")) {
			System.out.println("Enter Registration date");
			String date = sc.nextLine();
			System.out.println("Enter Educational Institution");
			String institute = sc.nextLine();
			System.out.println("Enter Educational Division");
			String division = sc.nextLine();
			ed = new EducationalEndowment(id,name,endowment,date,institute,division);
			double amount = ed.calculateEndowment();
			System.out.printf("Endowment Amount %.2f",amount);
			
		}
		else if(endowment.equalsIgnoreCase("health")) {
			System.out.println("Enter Registration date");
			String date = sc.nextLine();
			System.out.println("Enter Health Care Center");
			String center = sc.nextLine();
			System.out.println("Enter Holder Age");
			int age = sc.nextInt();
			hd = new HealthEndowment(id,name,endowment,date,center,age);
			double amount = hd.calculateEndowment();
			System.out.printf("Endowment Amount %.2f",amount);
			
		}else {
			System.out.println(endowment+" is an invalid endowment type");
		}
	}

}
