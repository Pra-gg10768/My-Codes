import java.util.Scanner;
public class UserInterface {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the room(in m)");
        int length = sc.nextInt();
        if (length>0) {
        	System.out.println("Enter the breadth of the room(in m)");
            int breadth = sc.nextInt();
            if (breadth>0) {
            	System.out.println("Enter the plant area of a single plant(in cm)");
                double plantArea = sc.nextInt();
                if (plantArea>0) {
                	plantArea = plantArea/10000.0;
                    
                    int floorArea = length*breadth;
                      
                    double totalPlantsExact = floorArea/plantArea;
                    
                    int totalPlants = ((int) totalPlantsExact/10)*10;
                    
                    float oxygen = totalPlants*0.9f;
                    
                    System.out.println("Total number of plants is "+totalPlants);
                    System.out.printf("Total oxygen production is %.2f liters", oxygen);
                }
                else {
                	System.out.println("Invalid plant area");
                }
            }
            else {
            	System.out.println("Invalid breadth");
            }
        }
        else {
        	System.out.println("Invalid length");
        }
               
    }

}
