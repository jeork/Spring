package com.oj.jul103.member;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Service
public class MemberDAO {

	@Autowired
	private SqlSession ss;

	public void signup(Member m, HttpServletRequest req) {

		try {

			String path = req.getSession().getServletContext().getRealPath("resources/img");

			MultipartRequest mr = new MultipartRequest(req, path, 30 * 1024 * 1024, "UTF-8",
					new DefaultFileRenamePolicy());
			m.setM_id(mr.getParameter("m_id"));
			m.setM_pw(mr.getParameter("m_pw"));
			m.setM_name(mr.getParameter("m_name"));
			m.setM_birth(mr.getParameter("m_birth"));
			m.setM_addr(mr.getParameter("m_addr"));
			m.setM_phone(mr.getParameter("m_phone"));

			String m_photo = mr.getFilesystemName("m_photo");
			String m_photo_kor = URLEncoder.encode(m_photo, "UTF-8").replace("+", " ");
			m.setM_photo(m_photo_kor);

			if (ss.getMapper(MemberMapper.class).signupMember(m) == 1) {
				req.setAttribute("r", "가입성공");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			req.setAttribute("r", "가입실패");
		}

	}

	public void login(Member m, HttpServletRequest req) {
		try {
			List<Member> members = ss.getMapper(MemberMapper.class).getMemberById(m);
			if (members.size()!=0) {
				Member dbM = members.get(0);
				
				if (dbM.getM_pw().equals(m.getM_pw())) {
					req.setAttribute("r", "로그인 성공");
					req.getSession().setAttribute("loginMember", dbM);
					req.getSession().setMaxInactiveInterval(1200);
				}
				else {
					req.setAttribute("r", "비밀번호가 틀립니다");
				}
			} else {
				req.setAttribute("r", "존재하지 않는 아이디 입니다");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "로그인 실패(DB서버)");
		}
	}

}
