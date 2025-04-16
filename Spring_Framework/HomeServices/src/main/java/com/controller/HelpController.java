// com/controller/HelpController.java
package com.controller;

import java.util.HashMap;
import java.util.Map;
import java.text.DecimalFormat; 
import org.springframework.web.bind.annotation.RequestParam;
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
    
    @RequestMapping(value = "/showpage")
    public String showPage(@ModelAttribute("helper") HelperBean helperBean, BindingResult result) {
        return "showpage";
    }

    @ModelAttribute("serviceList")
    public Map<String, String> buildState() {
        Map<String, String> serviceList = new HashMap<>();
        serviceList.put("ACService", "ACService");
        serviceList.put("WashingMachineService", "WashingMachineService");
        serviceList.put("RefrigeratorService", "RefrigeratorService");
        return serviceList;
    }
    @RequestMapping(value = "/helpdesk")
    public String calculateTotalCost(@ModelAttribute("helper") HelperBean helperBean, ModelMap model, BindingResult result) {
        double totalCost = helpService.calculateTotalCost(helperBean);
        DecimalFormat df = new DecimalFormat("0.0");
        String formattedTotalCost = df.format(totalCost);

   model.addAttribute("cost", formattedTotalCost);
//        model.addAttribute("totalCost","1600.0/-");
        return "helpdesk";
    }

}