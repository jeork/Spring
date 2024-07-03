package com.oj.jul033.convert;

public class convertResult {
	private double num;
	private String unit;
	private double rnum;
	private String result;

	public convertResult() {
		// TODO Auto-generated constructor stub
	}

	public convertResult(double num, String unit, double rnum, String result) {
		super();
		this.num = num;
		this.unit = unit;
		this.rnum = rnum;
		this.result = result;
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public double getRnum() {
		return rnum;
	}

	public void setRnum(double rnum) {
		this.rnum = rnum;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
	
}
