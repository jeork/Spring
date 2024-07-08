package com.oj.jul082.fruit;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitDAO {

	
	@Autowired
	private SqlSession ss;
	
	
	public void getFruitInfo(Fruit f, HttpServletRequest req) {
		
		try {
			FruitMapper fm = ss.getMapper(FruitMapper.class);
			
			fm.getFruitInfo(f);
			req.setAttribute( "f_name",f.getF_name());
			req.setAttribute("f_price",f.getF_price());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
