import java.util.Scanner;

public class UserInterface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of teams");
        int numTeams = Integer.parseInt(sc.nextLine());

        if (numTeams < 2) {
            System.out.println(numTeams + " is an invalid input");
            return;
        }

        String winner = "";
        float minTime = Float.MAX_VALUE;
        System.out.println("Enter the details");
        for (int i = 0; i < numTeams; i++) {         
            String input = sc.nextLine();
            String[] data = input.split(":");

            if (data.length != 5) { 
                System.out.println("Invalid input format");
                return;
            }

            String teamName = data[0];
            float totalTime = 0;

            for (int j = 1; j <= 4; j++) {
                float time = Float.parseFloat(data[j]);
                if (time < 1) {
                    System.out.println("Invalid number");
                    return;
                }
                totalTime += time;
            }
            if (totalTime < minTime) {
                minTime = totalTime;
                winner = teamName;
            }
        }
        System.out.printf("%s team wins the race in %.2f minutes\n", winner, minTime);
        sc.close();
    }
}
