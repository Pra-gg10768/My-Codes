package com.spring.app;
import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.spring.app")
public class AopConfig {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        EasyBank bank = context.getBean(EasyBank.class);
        
        while (true) {
            System.out.println("Select option\n1.Deposit\n2.Withdraw\n3.Change Pin\n4.Show Balance\n5.Exit");
            int choice = scanner.nextInt();
            if (choice == 5) break;
            
            System.out.println("Enter pin");
            int pin = scanner.nextInt();
            bank.setTempPin(pin);
            
            try {
                switch (choice) {
                    case 1:
                        System.out.println("Enter amount to deposit");
                        int depositAmount = scanner.nextInt();
                        bank.doDeposit(depositAmount);
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw");
                        int withdrawAmount = scanner.nextInt();
                        bank.doWithdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Enter your current pin");
                        int oldPin = scanner.nextInt();
                        System.out.println("Enter 4-digit new pin");
                        int newPin = scanner.nextInt();
                        bank.doChangePin(oldPin, newPin);
                        break;
                    case 4:
                        bank.showBalance();
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
	}
}