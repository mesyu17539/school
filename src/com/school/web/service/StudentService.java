package com.school.web.service;

import com.school.web.bean.StudentBean;

public interface StudentService {// 인터페이스는 오픈하는 코드
	public void addStudent(StudentBean studentBean); //객체지향 프로그래밍 (Java 분야)
	public void addScore(StudentBean score);
	public StudentBean login(StudentBean studentBean);
	public int getCount();
	public void setCount(int num);
	public StudentBean[] list();
	public StudentBean findStudentById(String id);//로그인 한 후이니까 이거만 필요하다
	public StudentBean[] findStudentByName(String name);
	public void upDatePass(StudentBean student);
	public void delDateStudent(String next);
}
