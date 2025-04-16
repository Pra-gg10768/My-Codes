package com.test;

import com.model.FoodOrder;
import com.exception.InvalidFoodOrderException;
import com.util.FoodShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FoodShopTest {
    
    private FoodShop bObj;

    @BeforeEach
    public void setUp() {
        bObj = new FoodShop();
        List<FoodOrder> foodOrders = new ArrayList<>();
        foodOrders.add(new FoodOrder(1, "John Doe", "Pizza", "Veg", 2, "NormalDelivery", 500.0));
        foodOrders.add(new FoodOrder(2, "Jane Doe", "Burger", "NonVeg", 1, "FastDelivery", 300.0));
        foodOrders.add(new FoodOrder(3, "Alice", "Pasta", "Veg", 3, "NormalDelivery", 450.0));
        bObj.setFoodOrderList(foodOrders);
    }
    
    @Test
    public void test11ViewFoodOrdersByFoodType() throws InvalidFoodOrderException {
        List<FoodOrder> vegOrders = bObj.viewFoodOrdersByFoodType("Veg");
        assertNotNull(vegOrders);
        assertFalse(vegOrders.isEmpty());
        assertEquals(2, vegOrders.size());
    }
    
    @Test
    public void test12ViewFoodOrdersByFoodTypeWise() throws InvalidFoodOrderException {
        Map<String, List<FoodOrder>> ordersByType = bObj.viewFoodOrdersByFoodTypeWise();
        assertNotNull(ordersByType);
        assertFalse(ordersByType.isEmpty());
        assertTrue(ordersByType.containsKey("Veg"));
        assertTrue(ordersByType.containsKey("NonVeg"));
        assertEquals(2, ordersByType.get("Veg").size());
        assertEquals(1, ordersByType.get("NonVeg").size());
    }
    
    @Test
    public void test13ViewFoodOrdersByFoodTypeForEmptyList() {
        bObj.setFoodOrderList(new ArrayList<>());
        assertThrows(InvalidFoodOrderException.class, () -> bObj.viewFoodOrdersByFoodType("Veg"));
    }
    
    @Test
    public void test14ViewFoodOrdersByFoodTypeWiseForEmptyList() {
        bObj.setFoodOrderList(new ArrayList<>());
        assertThrows(InvalidFoodOrderException.class, () -> bObj.viewFoodOrdersByFoodTypeWise());
    }
}
