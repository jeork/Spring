package com.oj.jul082.fruit;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FruitController {

	@Autowired
	private FruitDAO fDAO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getFruitInfo(Fruit f, HttpServletRequest req) {
		fDAO.getFruitInfo(f, req);
		return "";
	}

}
