package com.pragg.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
         City cty = context.getBean("city", City.class); 
         cty.setId(01); 
         cty.setName("Varanasi"); 
         State st = context.getBean("state", State.class); 
         st.setName("UP"); 
         cty.setState(st); 
         cty.showCityDetails(); 
    }
}
