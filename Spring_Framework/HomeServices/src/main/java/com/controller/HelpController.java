package com.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.HelperBean;
import com.service.HelperService;



@Controller
public class HelpController {

    @Autowired
    private HelperService helpService;

    @RequestMapping(value = "/showpage", method = RequestMethod.GET)
    public String showPage(@ModelAttribute("helper") HelperBean helperBean, BindingResult result) {
        return "showpage";
    }

    @ModelAttribute("serviceList")
    public Map<String, String> buildState() {
        Map<String, String> services = new LinkedHashMap<>();
        services.put("ACService", "ACService");
        services.put("WashingMachineService", "WashingMachineService");
        services.put("RefrigeratorService", "RefrigeratorService");
        return services;
    }

    @RequestMapping(value = "/helpdesk", method = RequestMethod.POST)
    public String calculateTotalCost(@ModelAttribute("helper") HelperBean helperBean, ModelMap model,
            BindingResult result) {

        double totalCost = helpService.calculateTotalCost(helperBean);
        model.addAttribute("message", "Thank you for choosing our Service.You need to pay Rs." + totalCost);
        return "helpdesk";
    }
}
