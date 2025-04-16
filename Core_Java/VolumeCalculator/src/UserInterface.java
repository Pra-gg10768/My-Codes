import java.util.Scanner;
public class UserInterface {
	
	public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator vc = new VolumeCalculator();
        System.out.println("Enter the choice\n1.Find the Volume for Cylinder\n2.Find the Volume for Cuboid");
        int choice = sc.nextInt();
        switch(choice) {
        case 1:
        	System.out.println("Enter the radius");
        	double radius = sc.nextDouble();
        	sc.nextLine();
        	System.out.println("Enter the height");
        	double height = sc.nextDouble();
        	sc.nextLine();
        	double volume = vc.calculateVolume(radius, height);
        	
        	System.out.printf("Volume of the cylinder is %.2f",volume);
        	break;
        case 2:
        	System.out.println("Enter the length");
        	int length = sc.nextInt();
        	sc.nextLine();
        	System.out.println("Enter the breadth");
        	int breadth = sc.nextInt();
        	sc.nextLine();
        	System.out.println("Enter the height");
        	int height1 = sc.nextInt();
        	double volume1 = vc.calculateVolume(length, breadth, height1);
        	
        	System.out.printf("Volume of the cuboid is %.2f",volume1);
        	break;
        }
        
        	
        
    }
}

