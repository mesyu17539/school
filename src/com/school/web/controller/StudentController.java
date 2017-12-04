package com.school.web.controller;

import java.util.Scanner;

import com.school.web.bean.StudentBean;
import com.school.web.service.StudentService;
import com.school.web.serviceImpl.StudentServiceImpl;

public class StudentController {
	public static void main(String[] str) {
//		내가 한것
		Scanner scan = new Scanner(System.in);
		System.out.println("학생의 인원수를 입력해주세요");
		StudentService studentService = new StudentServiceImpl(scan.nextInt());
//				StudentBean student = new StudentBean(); 왜 그런걸까
		while (true) {
			System.out.println("[학생메뉴] [0] 종료 [1] 학생등록 [2] 성적등록 [3] 총 학생수"
					+ "[4] 학생 이름 리스트 [5] 내정보 보기 [6] 이름 검색 [7] ");
			switch (scan.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				StudentBean student = new StudentBean();
				System.out.println("ID");
				student.setId(scan.next());
				System.out.println("PASS");
				student.setPass(scan.next());
				System.out.println("NAME");
				student.setName(scan.next());
				studentService.addStudent(student);
				break;
			case 2:
//				student = ; 객체 콜해야함
//				System.out.println("Kor");
//				student.setKor(scan.nextInt());
//				System.out.println("ENG");
//				student.setEng(scan.nextInt());
//				System.out.println("MATH");
//				student.setMath(scan.nextInt());
				break;
			case 3 : 
				System.out.println("총학수는"+studentService.getCount());
				break;
			case 4 :
				StudentBean[] students= studentService.list();
				for(int i=0; i<students.length-1;i++) {
					System.out.println("리스트들 명 : "+students[i].getName());
				}
				break;
			case 5 :
				String id=scan.next();
				System.out.println("학생 개인 지정 정보 열람 "+studentService.findStudentById(id).toString());
				break;
			case 6 :
				String name=scan.next();
				students=studentService.findStudentByName(name);
				for(int i=0;i<students.length;i++) {
					System.out.println("검색 결과 "+students[i].toString());
				}
				break;
			}
		}
//		Scanner scan = new Scanner(System.in);
//		System.out.println("학생의 인원수를 입력해주세요");
//		int count = scan.nextInt();
//		StudentService studentService = new StudentServiceImpl();
//		studentService.setNum(count);
//		StudentBean student = new StudentBean();
//		while (true) {
//			System.out.println("[학생메뉴] [0] 종료 [1] 학생등록 [2] 성적등록");
//			switch (scan.nextInt()) {
//			case 0:
//				System.out.println("종료");
//				return;
//			case 1:
//				System.out.println("ID");
//				student.setId(scan.next());
//				System.out.println("PASS");
//				student.setPass(scan.next());
//				System.out.println("NAME");
//				student.setName(scan.next());
//				studentService.addStudent(student);
//				break;
//			case 2:
//				System.out.println("Kor");
//				student.setKor(scan.nextInt());
//				System.out.println("ENG");
//				student.setEng(scan.nextInt());
//				System.out.println("MATH");
//				student.setMath(scan.nextInt());
//				break;
//			}
//		}
//		
	}
}
