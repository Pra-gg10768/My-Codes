package controller;

import model.Advertisement;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdvertisementController {
	
	@RequestMapping("/getdetails")
	String getAdvertisementpage(Advertisement aobj)
	{
    	return "advertisement";
	}
	
	@RequestMapping("/display")
    String displayAdvertisementDetails(Advertisement aobj) {
       
        return "success";
	}
}
