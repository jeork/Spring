package com.oj.jul022;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oj.jul022.book.Book;
import com.oj.jul022.dog.Dog;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	// Spring : Java에서 IoC로 DI 해주는 Framework
	// 객체를 .java에서 만들기
	// 객체를 외부파일(.xml)에 만들기 => .java에서 불러서 사용하게끔

	// IoC : 제어의 역전 (Inversion of Control)은 일반적인 디자인 패턴 중 하나이고
	// 프로그램의 제어 흐름을 직접 제어하는 것이 아니라 외부(파일)에서 관리하는 것
	// 의존성 주입(Dependency Injection)는 이런 제어의 역전 패턴을 달성하는 방법 중 하나

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		// 원래는 이렇게 객체를 만들었다면
//		Dog d = new Dog("개",3);
//		System.out.println(d.getName());
//		System.out.println(d.getAge());
		
		// jul022beans.xml 불러오기 => xml파일에 등록해놓은 객체를 만들어서
		
		AbstractApplicationContext aac = 
				new ClassPathXmlApplicationContext("jul022beans.xml");
		// aac가 없어질 때 등록해놓은 객체들은 다 없애라
		aac.registerShutdownHook();
		
		// id가 d인 강아지 객체를 불러오기
		Dog d = aac.getBean("d",Dog.class); // xml 객체 불러오기
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println("--------------");
		// DI (Dependency Injection, 의존성 주입)
		//	xml에서 객체 만들고, 속성값 넣고
		// java에서 가져다 쓰는
		Dog d2 = aac.getBean("d2",Dog.class); 
		System.out.println(d2.getName());
		System.out.println(d2.getAge());
		System.out.println("--------------");
		
		Dog d3 = aac.getBean("d3",Dog.class); 
		System.out.println(d3.getName());
		System.out.println(d3.getAge());
		System.out.println("--------------");
		
		// 책 객체를 만들어서 이름-가격 출력
		AbstractApplicationContext acc =
				new ClassPathXmlApplicationContext("jul022books.xml");
		
		Book b1 = acc.getBean("b1",Book.class);
		System.out.println(b1.getName());
		System.out.println(b1.getPrice());
		System.out.println("--------------");
		Book b2 = acc.getBean("b2",Book.class);
		System.out.println(b2.getName());
		System.out.println(b2.getPrice());
		System.out.println("--------------");
		
		
		// aac 없애기
		aac.close();
		
		return "home";
	}

}
