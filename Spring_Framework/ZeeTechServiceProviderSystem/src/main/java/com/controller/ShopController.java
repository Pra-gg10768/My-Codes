package com.controller;

import com.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import com.model.Connection;
import com.service.ProviderService;

@RestController
@RequestMapping("/SPS")
public class ShopController {	

	@Autowired
	private ProviderService providerService;

	@PutMapping("/updateConnectionType/{connectionNum}/{connectionType}")
	public boolean updateConnectionType(@PathVariable Integer connectionNum, @PathVariable String connectionType) {	
		return providerService.updateConnectionType(connectionNum, connectionType);
	}
    
	@DeleteMapping("/deleteConnection/{connectionNum}")
	public boolean deleteConnection(@PathVariable Integer connectionNum) {
		return providerService.deleteConnection(connectionNum);
	}	
}
