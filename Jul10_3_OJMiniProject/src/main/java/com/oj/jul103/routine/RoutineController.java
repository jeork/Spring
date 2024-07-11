package com.oj.jul103.routine;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RoutineController {

	@Autowired
	private RoutineDAO rDAO;

	@RequestMapping(value="/routine.go", method=RequestMethod.GET)
	public String goRoutine(HttpServletRequest req) {
		req.setAttribute("cp", "routine/routine.jsp");
		return "index";
	}
	@RequestMapping(value="/myroutine.go", method=RequestMethod.GET)
	public String goMyRoutine(HttpServletRequest req) {
		req.setAttribute("cp", "routine/myroutine.jsp");
		return "index";
	}

}
