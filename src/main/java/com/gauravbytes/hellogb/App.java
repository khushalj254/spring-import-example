package com.gauravbytes.hellogb;

import com.gauravbytes.hellogb.config.HelloGbAppConfig;
import com.gauravbytes.hellogb.dao.FunnyDao;
import com.gauravbytes.hellogb.service.GreetingService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;





/**
 * 
 * @author Gaurav Rai Mazra
 *
 */
public class App {
	public static void main(String[] args) {
		// using try with resources so that this context closes automatically
			ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(
		    HelloGbAppConfig.class);
			GreetingService greetingService = context.getBean(GreetingService.class);
			greetingService.greet();
			FunnyDao funnyDao = context.getBean("funny", FunnyDao.class);
			funnyDao.save("Hola wola!!!");

	}
}
