package com.oj.jul103.calc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalcController {

	@RequestMapping(value = "/calc.go", method = RequestMethod.GET)
	public String calculator(HttpServletRequest req) {
		req.setAttribute("cp", "calc/calc.jsp");
		return "index";
	}

}
