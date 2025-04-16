import java.util.Scanner;
import java.util.Set;

public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ClassHouseFormation houseFormation = new ClassHouseFormation();

        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 0) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        System.out.println("Enter the details");
        for (int i = 0; i < n; i++) {
            String details = sc.nextLine();
            houseFormation.addName(details);
        }

        Set<String> res = houseFormation.formTeam();
        for (String student : res) {
            System.out.println(student);
        }

        sc.close();
    }
}
