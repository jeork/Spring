package com.oj.jul103.member;

import java.util.List;

public interface MemberMapper {

	public abstract int signupMember(Member m);
	public abstract List<Member> getMemberById(Member m);
}
