package com.oj.jun023.dog;

import java.util.ArrayList;
import java.util.HashMap;

public class Dog {
	private String name;
	private int age;
	
	private String[] nickname;
	private ArrayList<String> friend;
	private HashMap<String, Integer> family;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name, int age, String[] nickname, ArrayList<String> friend, HashMap<String, Integer> family) {
		super();
		this.name = name;
		this.age = age;
		this.nickname = nickname;
		this.friend = friend;
		this.family = family;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String[] getNickname() {
		return nickname;
	}

	public void setNickname(String[] nickname) {
		this.nickname = nickname;
	}

	public ArrayList<String> getFriend() {
		return friend;
	}

	public void setFriend(ArrayList<String> friend) {
		this.friend = friend;
	}

	public HashMap<String, Integer> getFamily() {
		return family;
	}

	public void setFamily(HashMap<String, Integer> family) {
		this.family = family;
	}
	
	
	
	
}
