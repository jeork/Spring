package com.oj.jul102.weather;

public class Weather {
	private int hour;
	private double temp;
	private String wfKor;

	public Weather() {
		// TODO Auto-generated constructor stub
	}

	public Weather(int hour, double temp, String wfKor) {
		super();
		this.hour = hour;
		this.temp = temp;
		this.wfKor = wfKor;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public String getWfKor() {
		return wfKor;
	}

	public void setWfKor(String wfKor) {
		this.wfKor = wfKor;
	}

}
