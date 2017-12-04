package com.school.web.bean;

public class StudentBean {
	private int kor,eng,math;
	private String id,pass,name;
	
	public String toString() {
		return String.format("[ID] %s [PASS] : %s [NAME] : %s", id, pass, name);
		
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return this.id;
	}
	public void setPass(String pass) {
		this.pass=pass;
	}
	public String getPass() {
		return this.pass;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setKor(int kor) {
		this.kor=kor;
	}
	public int getkor() {
		return this.kor;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public int getEng() {
		return this.eng;
	}
	public void setMath(int math) {
		this.math=math;
	}
	public int getMath() {
		return this.math;
	}
}
