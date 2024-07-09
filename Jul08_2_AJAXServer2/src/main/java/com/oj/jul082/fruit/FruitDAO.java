package com.oj.jul082.fruit;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FruitDAO {

	@Autowired
	private SqlSession ss;

	public void getAllFruit(HttpServletRequest req) {
		try {
			req.setAttribute("fruits", ss.getMapper(FruitMapper.class).getAllFruit());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public Fruits getXML(HttpServletRequest req) {
		List<Fruit> fruits = ss.getMapper(FruitMapper.class).getAllFruit();
		Fruits fruitss = new Fruits(fruits);
		return fruitss;
	}

	public Fruits searchXML(Fruit f, HttpServletRequest req) {
		return new Fruits(ss.getMapper(FruitMapper.class).searchFruit(f));
	}
}
