package com.zyl.beans;

public class Heros {

	private Integer hid;
	private String hname;
	private Double price;
	private String uptime;
	private Integer status;
	
	private Integer cid;
	private String cname;
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getUptime() {
		return uptime;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Heros(Integer hid, String hname, Double price, String uptime, Integer status, Integer cid, String cname) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.price = price;
		this.uptime = uptime;
		this.status = status;
		this.cid = cid;
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Heros [hid=" + hid + ", hname=" + hname + ", price=" + price + ", uptime=" + uptime + ", status="
				+ status + ", cid=" + cid + ", cname=" + cname + "]";
	}
	public Heros() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
