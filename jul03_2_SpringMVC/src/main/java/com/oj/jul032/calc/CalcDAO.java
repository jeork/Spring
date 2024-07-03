package com.oj.jul032.calc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

// 멤버변수가 없으면 : static method 기반으로 구현하면 되는데
// M / DAO에는 게시판 같은 기능을 구현한다면 멤버변수가 생김
//	=> static 기반 method는 포기해야함 => 객체를 만들어서 사용해야하는데
//	=> 요청 or 새로고침 => calculate.do로 요청할 때마다 새로운 cDAO가 생성됨
//	=> 메모리 폭발 (메모리를 계속 사용하게 됨, 비효율적)
//		+ allCalcCount도 제대로 카운팅 안됨

// 해결방안 : CalcDAO를 singleton 처리!

// Spring식의 singleton 처리 방법
@Service	//servlet-context.xml에 CalcDAO객체 하나를 등록해 놓은 효과
public class CalcDAO {
	private int allCalcCount; // 몇 번 계산했는지
	
	public void calculate(CalcResult cr, HttpServletRequest req) {
		allCalcCount++;
		req.setAttribute("allCalcCount", allCalcCount);
		int add = cr.getX() + cr.getY();
		req.setAttribute("add", add);
	}
	
}
