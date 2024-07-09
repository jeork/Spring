package com.oj.jul092.error;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ErrorDAO {
	
	@Autowired
	private SqlSession ss;
	
	public void getError(HttpServletRequest req) {
		try {
			req.setAttribute("errors", ss.getMapper(errorMapper.class).getError());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Errors getJSON(HttpServletRequest req) {
		return new Errors(ss.getMapper(errorMapper.class).getError());
	}
	public Errors searchJSON(Error e, HttpServletRequest req) {
		return new Errors(ss.getMapper(errorMapper.class).searchError(e));
	}

}
