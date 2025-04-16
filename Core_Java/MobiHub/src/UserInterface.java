import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        System.out.println("Enter Model");
        String model = sc.nextLine();

        System.out.println("Enter display (in inches)");
        double display = sc.nextDouble();

        System.out.println("Enter Price");
        double price = sc.nextDouble();

    
        IphoneSeries iphone = new IphoneSeries(model, display, price);


        System.out.println("\nIPhone Details");
        System.out.println("Model : " + iphone.getModel());
        System.out.println("Display in (inches): " + iphone.getDisplay());
        System.out.println("Price : " + iphone.getPrice());


        double amountToBePaid = iphone.calculateDiscount();
        System.out.println("Amount to be paid : " + amountToBePaid);


        if (iphone.getClass().isAnnotationPresent(SmartPhone.class)) {
            SmartPhone sp = iphone.getClass().getAnnotation(SmartPhone.class);
            System.out.println("OS : " + sp.os());
            System.out.println("Version : " + sp.version());
        }

        sc.close();
    }
}