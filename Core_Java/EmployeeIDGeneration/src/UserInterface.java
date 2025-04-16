import java.util.Scanner;

public class UserInterface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the training id");
        String trainingId = sc.nextLine();

        if (trainingId.length() != 9) {
            System.out.println(trainingId + " is an invalid training id");
            return;
        }

        String year = trainingId.substring(0, 4);
        String teamCode = trainingId.substring(4, 6);
        String rollNumber = trainingId.substring(6, 9);

        if (!year.equals("2021")) {
            System.out.println(year + " is an invalid year");
            return;
        }
        String[] validCodes = {"01", "02", "03", "04", "05"};
        String[] teamNames = {"LP", "TA", "CT", "PT", "TT"};
        String team = null;

        for (int i = 0; i < validCodes.length; i++) {
            if (validCodes[i].equals(teamCode)) {
                team = teamNames[i];
                break;
            }
        }
        if (team == null) {
            System.out.println(teamCode + " is an invalid team code");
            return;
        }
        if (rollNumber.equals("000")) {
            System.out.println(rollNumber + " is an invalid roll number");
            return;
        }
        System.out.println("Employee Id: SIET" + team + rollNumber);
    }
}
