package com.ashwath.binding;

public class Ticket {
	private Integer ticketnumber;
	private String name;
	private String email;
	private String doj;
	private String from;
	private String to;
	private String trainno;
	private String status;
	public Integer getTicketnumber() {
		return ticketnumber;
	}
	public void setTicketnumber(Integer ticketnumber) {
		this.ticketnumber = ticketnumber;
	}
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Ticket [ticketnumber=" + ticketnumber + ", name=" + name + ", email=" + email + ", doj=" + doj
				+ ", from=" + from + ", to=" + to + ", trainno=" + trainno + ", status=" + status + "]";
	}
	
}
