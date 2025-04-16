import java.util.Scanner;
public class UserInterface {
	
	public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter Student's Name:");
        String name = sc.nextLine();
        
        System.out.println("Enter Student's address:");
        String address = sc.nextLine();
        
        Student st = null;
        
        while (true) {
            System.out.println("Whether the student is from NIT (Yes/No):");
            String input = sc.next();
            sc.nextLine();          
            if (input.equalsIgnoreCase("No")) {
                System.out.println("Enter the college name:");
                String collegeName = sc.nextLine();
                st = new Student(id, name, address, collegeName);
                break;
            } else if (input.equalsIgnoreCase("Yes")) {
                st = new Student(id, name, address, "NIT");
                break;
            } else {
                System.out.println("Wrong Input");
            }
        }
        
        System.out.println("Student id:"+st.getStudentId());
        System.out.println("Student name:"+st.getStudentName());
        System.out.println("Address:"+st.getStudentAddress());
        System.out.println("College name:"+st.getCollegeName());
    }
}

