package com.ashwath.binding;

public class Passenger {
	private String name;
	private String email;
	private String doj;
	private String from;
	private String to;
	private String trainno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTrainno() {
		return trainno;
	}
	public void setTrainno(String trainno) {
		this.trainno = trainno;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", email=" + email + ", doj=" + doj + ", from=" + from + ", to=" + to
				+ ", trainno=" + trainno + "]";
	}
	
}
