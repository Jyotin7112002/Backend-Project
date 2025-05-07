package com.TRMS.Model;



import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Passengers {

	@Id
	private String pemail;
	private String pname;
	private int page;
	private String pgen;
	private String ppoint;
	private String pdes;
	@Temporal(TemporalType.DATE)
	private Date pdate;
	private String ppay;
	private long pcontact;
	public String getPemail() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getPgen() {
		return pgen;
	}
	public void setPgen(String pgen) {
		this.pgen = pgen;
	}
	public String getPpoint() {
		return ppoint;
	}
	public void setPpoint(String ppoint) {
		this.ppoint = ppoint;
	}
	public String getPdes() {
		return pdes;
	}
	public void setPdes(String pdes) {
		this.pdes = pdes;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	public String getPpay() {
		return ppay;
	}
	public void setPpay(String ppay) {
		this.ppay = ppay;
	}
	public long getPcontact() {
		return pcontact;
	}
	public void setPcontact(long pcontact) {
		this.pcontact = pcontact;
	}
	@Override
	public String toString() {
		return "Passengers [pemail=" + pemail + ", pname=" + pname + ", page=" + page + ", pgen=" + pgen + ", ppoint="
				+ ppoint + ", pdes=" + pdes + ", pdate=" + pdate + ", ppay=" + ppay + ", pcontact=" + pcontact + "]";
	}
	public Passengers(String pemail, String pname, int page, String pgen, String ppoint, String pdes, Date pdate,
			String ppay, long pcontact) {
		super();
		this.pemail = pemail;
		this.pname = pname;
		this.page = page;
		this.pgen = pgen;
		this.ppoint = ppoint;
		this.pdes = pdes;
		this.pdate = pdate;
		this.ppay = ppay;
		this.pcontact = pcontact;
	}
	public Passengers() {
		super();
		// TODO Auto-generated constructor stub
	}

}
