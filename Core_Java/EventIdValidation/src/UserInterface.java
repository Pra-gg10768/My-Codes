import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your ID");
        String id = sc.nextLine();

        if (id.length() != 10 || !id.startsWith("SPC") || !id.substring(3, 6).matches("[0-9]{3}") || !id.substring(6, 8).matches("[0-9]{2}") || !(id.endsWith("AM") || id.endsWith("PM"))) {
            System.out.println(id + " is an Invalid ID");
            return;
        }

        int time = Integer.parseInt(id.substring(6, 8));

        if (time < 1 || time > 12) {
            System.out.println(id + " is an Invalid ID");
            return;
        }

        System.out.println("Hi " + name + " your seat number is " + id.substring(3, 6) + " and the event starts at " + time + id.substring(8));
    }
}
