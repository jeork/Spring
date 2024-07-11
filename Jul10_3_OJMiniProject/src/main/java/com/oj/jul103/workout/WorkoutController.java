package com.oj.jul103.workout;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WorkoutController {

	@RequestMapping(value="/workout.go", method=RequestMethod.GET)
	public String workoutInfo(HttpServletRequest req) {
		req.setAttribute("cp","workout/workoutInfo.jsp");
		return "index";
	}
	@RequestMapping(value="/workoutRe.go", method=RequestMethod.GET)
	public String workoutInfoRe(HttpServletRequest req) {
		return workoutInfo(req);
	}
	@RequestMapping(value="/leg.go", method=RequestMethod.GET)
	public String legInfo(HttpServletRequest req) {
		req.setAttribute("cp","workout/legInfo.jsp");
		return "index";
	}
	@RequestMapping(value="/upper.go", method=RequestMethod.GET)
	public String upperInfo(HttpServletRequest req) {
		req.setAttribute("cp","workout/upperInfo.jsp");
		return "index";
	}
	@RequestMapping(value="/bi.go", method=RequestMethod.GET)
	public String biInfo(HttpServletRequest req) {
		req.setAttribute("cp","workout/biInfo.jsp");
		return "index";
	}
	@RequestMapping(value="/tri.go", method=RequestMethod.GET)
	public String triInfo(HttpServletRequest req) {
		req.setAttribute("cp","workout/triInfo.jsp");
		return "index";
	}
	@RequestMapping(value="/abs.go", method=RequestMethod.GET)
	public String absInfo(HttpServletRequest req) {
		req.setAttribute("cp","workout/absInfo.jsp");
		return "index";
	}
}
