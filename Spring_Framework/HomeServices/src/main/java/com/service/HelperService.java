// com/service/HelperService.java
package com.service;

import com.model.HelperBean;
import org.springframework.stereotype.Service;

@Service
public class HelperService {
    public double calculateTotalCost(HelperBean helperBean) {
    	  if ("ACService".equals(helperBean.getServiceType())) {
              helperBean.setServiceCostPerHour(400f);
          }  if ("WashingMachineService".equals(helperBean.getServiceType())) {
              helperBean.setServiceCostPerHour(500f);
          }  if ("RefrigeratorService".equals(helperBean.getServiceType())) {
              helperBean.setServiceCostPerHour(300f);
          }

          return helperBean.getServiceCostPerHour() * helperBean.getNoOfHours();
    }
}