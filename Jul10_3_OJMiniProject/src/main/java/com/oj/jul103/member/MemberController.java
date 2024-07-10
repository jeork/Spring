package com.oj.jul103.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@Autowired
	private MemberDAO mDAO;
	
	@RequestMapping(value="/member.login.go", method=RequestMethod.GET)
	public String goLogin(HttpServletRequest req) {
		req.setAttribute("cp", "member/login.jsp");
		return "index";
	}
	
	@RequestMapping(value="/member.signup.go", method=RequestMethod.GET)
	public String goSignup(HttpServletRequest req) {
		req.setAttribute("cp", "member/signup.jsp");
		return "index";
	}
	
	@RequestMapping(value="/member.signup", method=RequestMethod.POST)
	public String signupMember(Member m,HttpServletRequest req) {
		mDAO.signup(m, req);
		req.setAttribute("cp", "home.jsp");
		return "index";
	}
	
	@RequestMapping(value="/member.login", method=RequestMethod.POST)
	public String login(Member m, HttpServletRequest req) {
		mDAO.login(m, req);
		req.setAttribute("cp", "home.jsp");
		return "index";
	}
	
}
