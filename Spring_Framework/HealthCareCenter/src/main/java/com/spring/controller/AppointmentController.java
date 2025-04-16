package com.spring.controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import com.spring.model.Appointment;
import com.spring.service.AppointmentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppointmentController {

	@Autowired
	private AppointmentService service;

	@GetMapping("/showPage")
	public String showPage(@ModelAttribute("appointment") Appointment appointment) {
		return "showPage";
	}

	@ModelAttribute("consultationList")
	public ArrayList<String> populateConsultation() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Optometry");
		list.add("Psychology");
		list.add("Pediatrist");
		list.add("Physical therapy");
		list.add("Dentistry");
		return list;
	}

	@PostMapping("/consultation")
	public String bookAppointment(@ModelAttribute("appointment") Appointment appointment, ModelMap model) {
		int charge = service.bookAppointment(appointment);
		String message = "Thanks for visiting.Your consultation charges is Rs. " + charge;
		model.addAttribute("message", message);
		return "showPage";
	}
}