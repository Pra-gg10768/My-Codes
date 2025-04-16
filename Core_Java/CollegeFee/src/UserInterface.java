import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Student Id");
    	int studentId = sc.nextInt();
    	sc.nextLine();
    	
    	System.out.println("Enter Student name");
    	String studentName = sc.nextLine();
    	
    	System.out.println("Enter Department name");
    	String deptName = sc.nextLine();
    	
    	System.out.println("Enter gender");
    	String gender = sc.nextLine();
    	
    	System.out.println("Enter category");
    	String category = sc.nextLine();
    	
    	if(category.equals("Hosteller")) {
    		System.out.println("Enter College fee");
    		double collegeFee = sc.nextDouble();
    		
    		System.out.println("Enter the room number");
    		int roomNumber = sc.nextInt();
    		
    		System.out.println("Enter the Block name");
    		char blockName = sc.next().charAt(0);
    		
    		System.out.println("Enter the room type");
    		String roomType = sc.nextLine();
    		
    		Hosteller ht = new Hosteller(studentId, studentName, deptName, gender, category, collegeFee, roomNumber, blockName, roomType);
    		double totalAmt = ht.calculateTotalFee();
    		
    		System.out.println("Total College fee is "+totalAmt);
    	}
    	
    	else if(category.equals("DayScholar")) {
    		System.out.println("Enter College fee");
    		double collegeFee = sc.nextDouble();
    		
    		System.out.println("Enter Bus number");
    		int busNumber = sc.nextInt();
    		
    		System.out.println("Enter the distance");
    		float distance = sc.nextFloat();
    		sc.nextLine();
    		
    		DayScholar ds = new DayScholar(studentId, studentName, deptName, gender, category, collegeFee, busNumber, distance);
    		double totalAmt = ds.calculateTotalFee();
    		
    		System.out.println("Total College fee is "+totalAmt);
    	}
    	
	}

}
