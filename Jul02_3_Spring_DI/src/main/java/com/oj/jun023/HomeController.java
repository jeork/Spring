package com.oj.jun023;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oj.jun023.human.Human;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		AbstractApplicationContext aac=
				new ClassPathXmlApplicationContext("jul023beans,xml");
		
		Human h1 = aac.getBean("h1",Human.class);
		System.out.println(h1.getName());
		System.out.println(h1.getAge());
		
		for(String nn: h1.getNickname()) {
			System.out.println(nn);
		}
		
		for(String f : h1.getFriend()) {
			System.out.println(f);
		}
		
		System.out.println(h1.getFamily().get("아버지"));
		System.out.println(h1.getFamily().get("어머니"));
		
		System.out.println(h1.getPet2().getName());
		System.out.println(h1.getPet2().getAge());
		aac.registerShutdownHook();
		
		return "home";
	}
	
}
