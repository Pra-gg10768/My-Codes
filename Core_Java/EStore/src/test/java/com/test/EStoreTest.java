package com.test;
import com.exception.InvalidOnlineOrderException;
import com.model.OnlineOrder;
import com.test.Main;
import com.util.EStore;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class EStoreTest {
	private static EStore bObj;

	@BeforeAll
	public static void setUp() throws Exception {
		
		List<OnlineOrder> orderList = new ArrayList<>();

		orderList.add(new OnlineOrder(101, "John Doe", "Laptop", "Electronics", 1, "Home Delivery", 50000));
		orderList.add(new OnlineOrder(102, "Jane Smith", "iPhone", "Mobiles", 1, "Store Pickup", 80000));
		orderList.add(new OnlineOrder(103, "Alice Brown", "Sanitizer", "Essentials", 5, "Home Delivery", 500));
		orderList.add(new OnlineOrder(104, "Bob White", "T-shirt", "Fashion", 2, "Store Pickup", 2000));
		
        bObj = new EStore();
        bObj.setOnlineOrderList(orderList);

	}

	@Test
	public void test11ValidateItemTypeWhenElectronics(){
		assertDoesNotThrow(() -> bObj.validateItemType("Electronics"));

	}
	
	@Test
	public void test12ValidateItemTypeWhenMobiles(){
		assertDoesNotThrow(() -> bObj.validateItemType("Mobiles"));


	}
	
	@Test
	public void test13ValidateItemTypeWhenEssentials(){
		 assertDoesNotThrow(() -> bObj.validateItemType("Essentials"));

	}

	@Test
	public void test14ValidateItemTypeWhenFashion(){
		assertDoesNotThrow(() -> bObj.validateItemType("Fashion"));

	}
	
	@Test
	public void test15ValidateItemTypeWhenInvalid(){
		Exception exception = assertThrows(InvalidOnlineOrderException.class, () -> bObj.validateItemType("Toys"));
	    assertEquals("Item Type is invalid", exception.getMessage()); 
		
	}
	
	
	@Test
	public void test16ViewOnlineOrdersByOrderIdWhenValid(){
		OnlineOrder order = assertDoesNotThrow(() -> bObj.viewOnlineOrdersByOrderId(101));
        assertNotNull(order);
        assertEquals(101, order.getOrderId());
        assertEquals("John Doe", order.getCustomerName());

	}

	//Test the viewOnlineOrdersByOrderId method when the value is Invalid
	@Test
	public void test17ViewOnlineOrdersByOrderIdWhenInvalid(){
		Exception exception = assertThrows(InvalidOnlineOrderException.class, () -> bObj.viewOnlineOrdersByOrderId(999));
	    assertEquals("Order Id is invalid", exception.getMessage()); 


	}


	 
}
