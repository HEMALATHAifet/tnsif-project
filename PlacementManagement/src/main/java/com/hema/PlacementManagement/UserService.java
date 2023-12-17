package com.hema.PlacementManagement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserService{
	@Id
	@Column(name="uid")
	private int uid;
	
	@Column(name="uname")
	private String uname;
	
	@Column(name="address")
	private String address;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="degree")
	private String degree;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="cgpa")
	private float cgpa;
	
	@Column(name="puc")
	private float puc;
	
	@Column(name="sslc")
	private float sslc;
	
	@Column(name="yop")
	private int yop;
	
	@Column(name="skills")
	private String skills;
	

	public UserService() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserService(int uid, String uname, String address, String dob, String degree, String branch, float cgpa,
			float puc, float sslc, int yop, String skills) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.address = address;
		this.dob = dob;
		this.degree = degree;
		this.branch = branch;
		this.cgpa = cgpa;
		this.puc = puc;
		this.sslc = sslc;
		this.yop = yop;
		this.skills = skills;
	}


	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public float getCgpa() {
		return cgpa;
	}


	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}


	public float getPuc() {
		return puc;
	}


	public void setPuc(float puc) {
		this.puc = puc;
	}


	public float getSslc() {
		return sslc;
	}


	public void setSslc(float sslc) {
		this.sslc = sslc;
	}


	public int getYop() {
		return yop;
	}


	public void setYop(int yop) {
		this.yop = yop;
	}


	public String getSkills() {
		return skills;
	}


	public void setSkills(String skills) {
		this.skills = skills;
	}


	@Override
	public String toString() {
		return "UserService [uid=" + uid + ", uname=" + uname + ", address=" + address + ", dob=" + dob + ", degree="
				+ degree + ", branch=" + branch + ", cgpa=" + cgpa + ", puc=" + puc + ", sslc=" + sslc + ", yop=" + yop
				+ ", skills=" + skills + "]";
	}
	
	
}
