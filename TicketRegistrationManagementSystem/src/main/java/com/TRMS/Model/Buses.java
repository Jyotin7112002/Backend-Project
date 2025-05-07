package com.TRMS.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Buses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	private String bNo;
	private String bName;
	private String bPrice;
	
	
	
	@Override
	public String toString() {
		return "Buses [bid=" + bid + ", bNo=" + bNo + ", bName=" + bName + ", bPrice=" + bPrice + "]";
	}
	public Buses(int bid, String bNo, String bName, String bPrice) {
		super();
		this.bid = bid;
		this.bNo = bNo;
		this.bName = bName;
		this.bPrice = bPrice;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getbNo() {
		return bNo;
	}
	public void setbNo(String bNo) {
		this.bNo = bNo;
	}

	public String getbPrice() {
		return bPrice;
	}
	public void setbPrice(String bPrice) {
		this.bPrice = bPrice;
	}
	
	public Buses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
