package com.oj.jul033.convert;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class convertController {
	@Autowired	
	private ConvertDAO ucd;
	
	@RequestMapping(value="convert.do", method=RequestMethod.POST)
	public String convert(convertResult cr, HttpServletRequest req) {
		ucd.convert(cr, req);
		return "output";
	}
}
