package com.oj.jul033.convert;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class ConvertDAO {
	
	private HashMap<String, String> unit;

	public void setUnit(HashMap<String, String> unit) {
		this.unit = unit;
	}



	public void convert(convertResult cr, HttpServletRequest req) {
		double num = cr.getNum();
		String cOption = req.getParameter("cOption");
		double rnum = num*1.61;
		
		req.setAttribute("num", num);
		String result;
		
		
		switch (cOption) {
		case "CmToInch":
			rnum = num * 0.39;
			break;
		case "M2ToSqft":
			rnum = num * 0.3;
			break;
		case "CelToFah":
			rnum = num*1.8 + 32;
			break;
		case "MiToKm":
			rnum = num * 1.609344;
			break;
		default:
			break;
		}
		
		System.out.println(unit);
		System.out.println(unit.get(cOption));
		
		String[] u = unit.get(cOption).split(",");
		
		cr.setNum(num);
		cr.setRnum(rnum);
		cr.setUnit(u[1]);
		cr.setResult(u[2]);
		req.setAttribute("cr", cr);
	}
}
