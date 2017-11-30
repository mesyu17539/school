package com.school.web.controller;

import java.util.Scanner;

import com.school.web.bean.StudentBean;
import com.school.web.service.StudentService;
import com.school.web.serviceImpl.StudentServiceImpl;

public class StudentController {
	public void main(String[] str) {
		Scanner scan = new Scanner(System.in);
		StudentService studentService=new StudentServiceImpl();
		StudentBean student = new StudentBean();
		while(true) {
			System.out.println("[학생메뉴] [0] 종료 [1] 학생등록 [2] 성적등록");
			switch(scan.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("ID");
				student.setId(scan.next());
				System.out.println("PASS");
				student.setPass(scan.next());
				System.out.println("NAME");
				student.setName(scan.next());
				studentService.addStudent(student);
				break;
			case 2 :
				System.out.println("Kor");
				student.setKor(scan.nextInt());
				System.out.println("ENG");
				student.setEng(scan.nextInt());
				System.out.println("MATH");
				student.setMath(scan.nextInt());
				break;
			}
		}
	}
}
