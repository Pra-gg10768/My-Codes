package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.service.ProviderService;

@RestController
@RequestMapping("/SPS")
public class ShopController {

	@Autowired
	private ProviderService providerService;

	@PutMapping("/updateConnectionType/{connectionNum}/{connectionType}")
	public @ResponseBody Map<String, String> updateConnectionType(
			@PathVariable("connectionNum") int connectionNum,
			@PathVariable("connectionType") String connectionType) {

		boolean result = providerService.updateConnectionType(connectionNum, connectionType);
		Map<String, String> response = new HashMap<>();
		if (result) {
			response.put("message", "Connection type updated successfully");
		} else {
			response.put("message", "Connection not found");
		}
		return response;
	}

	@DeleteMapping("/deleteConnection/{connectionNum}")
	public @ResponseBody Map<String, String> deleteConnection(
			@PathVariable("connectionNum") int connectionNum) {

		boolean result = providerService.deleteConnection(connectionNum);
		Map<String, String> response = new HashMap<>();
		if (result) {
			response.put("message", "Connection deleted successfully");
		} else {
			response.put("message", "Connection not found");
		}
		return response;
	}
}
