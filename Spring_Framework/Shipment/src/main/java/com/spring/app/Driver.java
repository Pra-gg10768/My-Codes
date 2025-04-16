package com.spring.app;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Shipment shipment1 = (Shipment) context.getBean("shipment");
        System.out.println("Shipment Details1");
        System.out.println("Enter the Item Name");
        shipment1.getItem().setItemName(scanner.nextLine());
        System.out.println("Enter the Item Price");
        shipment1.getItem().setPrice(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Enter the ShipmentId");
        shipment1.setShipmentId(scanner.nextLine());
        System.out.println("Enter the Delivery Status");
        shipment1.setDeliveryStatus(scanner.nextLine());

        Shipment shipment2 = (Shipment) context.getBean("shipment");
        System.out.println("\nShipment Details2");
        System.out.println("Enter the Item Name");
        shipment2.getItem().setItemName(scanner.nextLine());
        System.out.println("Enter the Item Price");
        shipment2.getItem().setPrice(scanner.nextDouble());
        scanner.nextLine(); 
        System.out.println("Enter the ShipmentId");
        shipment2.setShipmentId(scanner.nextLine());
        System.out.println("Enter the Delivery Status");
        shipment2.setDeliveryStatus(scanner.nextLine());

        System.out.println("Delivery status of shipment ID: " + shipment1.getShipmentId() + " is " + shipment1.getDeliveryStatus());
        System.out.println("Delivery status of shipment ID: " + shipment2.getShipmentId() + " is " + shipment2.getDeliveryStatus());

	}	 

	
}
