package com.school.web.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.school.web.bean.StudentBean;
import com.school.web.service.StudentService;
import com.school.web.serviceImpl.StudentServiceImpl;
import com.school.web.ui.MainPage;

public class StudentController {
	public static void main(String[] args) {
		StudentService studentService = new StudentServiceImpl();
//		StudentBean[] students= null;
		StudentBean student = null;
		String str="";
		while (true) {
			switch (JOptionPane.showInputDialog("[학생메뉴] [0] 종료 [1] 학생등록 [2] 성적등록 [3] 총 학생수\n"
					+ "[4] 학생 이름 리스트 [5] 내정보 보기 [6] 이름 검색 [7] 비번변경\n "
					+"[8] 아이디 삭제 [9] 화면보기 ")) {
			case "0":
				return;
			case "1":
				student = new StudentBean();
				student.setId(JOptionPane.showInputDialog("ID"));
				student.setPass(JOptionPane.showInputDialog("PASS"));
				student.setName(JOptionPane.showInputDialog("NAME"));
				studentService.addStudent(student);
				break;
			case "2":
//				student = ; 객체 콜해야함
//				System.out.println("Kor");
//				student.setKor(scan.nextInt());
//				System.out.println("ENG");
//				student.setEng(scan.nextInt());
//				System.out.println("MATH");
//				student.setMath(scan.nextInt());
				break;
			case "3" : 
				JOptionPane.showMessageDialog(null, "총학수는"+studentService.getCount());
				break;
			case "4" :
				str="";
				StudentBean[] students= studentService.list();
				for(int i=0; i<studentService.getCount();i++) {
					str+=students[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, str);
				break;
			case "5" :
				JOptionPane.showMessageDialog(null, "학생 개인 지정 정보 열람 "+studentService.findStudentById(JOptionPane.showInputDialog("id")).toString());
				break;
			case "6" :
				str="";
				students=studentService.findStudentByName(JOptionPane.showInputDialog("NAME"));
				for(int i=0;i<studentService.getCount();i++) {
					str+=students[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, str);
				break;
			case "7":
				//자신의 아이디 변경
				student=new StudentBean();//파라미터 생성(초기화)가 아니라 이곳에 있는 값일 뿐이다.
				student.setId(JOptionPane.showInputDialog("ID"));
				student.setPass(JOptionPane.showInputDialog("PASS"));
				studentService.upDatePass(student);
				JOptionPane.showMessageDialog(null, "새로운 비밀번호 : "+studentService.findStudentById(student.getId()).toString());
				break;
			case "8":
				studentService.delDateStudent(JOptionPane.showInputDialog("아이디를 입력하세요"));
				break;
			case "9":
				MainPage mainPage=new MainPage();
				break;
			}
		}
	}
}
//	public static void main(String[] str) {
////		내가 한것
////		Scanner scan = new Scanner(System.in);
//		
////1		System.out.println("학생의 인원수를 입력해주세요");
////		StudentService studentService = new StudentServiceImpl(scan.nextInt());
//		
////2		String sCount = JOptionPane.showInputDialog("학생 수 입력");
////		int count=Integer.parseInt(sCount);
////		StudentService studentService = new StudentServiceImpl(count);
//		StudentService studentService = 
//				new StudentServiceImpl(
//						Integer.parseInt(
//								JOptionPane.showInputDialog("학생 수 입력")));
//		while (true) {
////			System.out.println("[학생메뉴] [0] 종료 [1] 학생등록 [2] 성적등록 [3] 총 학생수 "
////					+ "[4] 학생 이름 리스트 [5] 내정보 보기 [6] 이름 검색 [7] 비번변경 "
////					+"[8] 아이디 삭제 [9] 화면보기 ");
//			switch (JOptionPane.showInputDialog("[학생메뉴] [0] 종료 [1] 학생등록 [2] 성적등록 [3] 총 학생수 "
//					+ "[4] 학생 이름 리스트 [5] 내정보 보기 [6] 이름 검색 [7] 비번변경 "
//					+"[8] 아이디 삭제 [9] 화면보기 ")) {
//					case "0":
////				System.out.println("종료");
//						return;
//					case "1":
//						StudentBean student = new StudentBean();
//						student.setId(JOptionPane.showInputDialog("ID"));
//						student.setPass(JOptionPane.showInputDialog("PASS"));
//						student.setName(JOptionPane.showInputDialog("NAME"));
////				System.out.println("ID");
////				student.setId(scan.next());
////				System.out.println("PASS");
////				student.setPass(scan.next());
////				System.out.println("NAME");
////				student.setName(scan.next());
//						studentService.addStudent(student);
//						break;
//					case "2":
////				student = ; 객체 콜해야함
////				System.out.println("Kor");
////				student.setKor(scan.nextInt());
////				System.out.println("ENG");
////				student.setEng(scan.nextInt());
////				System.out.println("MATH");
////				student.setMath(scan.nextInt());
//						break;
//					case "3" : 
//						System.out.println("총학수는"+studentService.getCount());
//						break;
//					case "4" :
//						StudentBean[] students= studentService.list();
//						for(int i=0; i<studentService.getCount();i++) {
//							System.out.println("리스트들 명 : "+students[i].toString());
//						}
//						break;
//					case "5" :
//						System.out.println("학생 개인 지정 정보 열람 "+studentService.findStudentById(JOptionPane.showInputDialog("id")).toString());
////				String id=scan.next();
////				System.out.println("학생 개인 지정 정보 열람 "+studentService.findStudentById(id).toString());
//						break;
//					case "6" :
////				String name=scan.next();
////				students=studentService.findStudentByName(name);
//						students=studentService.findStudentByName(JOptionPane.showInputDialog("NAME"));
//						for(int i=0;i<studentService.getCount();i++) {
//							System.out.println("검색 결과 "+students[i].toString());
//						}
//						break;
//					case "7":
//						//자신의 아이디 변경
//						student=new StudentBean();//파라미터 생성(초기화)가 아니라 이곳에 있는 값일 뿐이다.
////				System.out.println("아이디를 입력하세요");
////				student.setId(scan.next());
////				System.out.println("새로운 비밀번호를 입력하세요");
////				student.setId(scan.next());
////				student.setPass(scan.next());
//						student.setId(JOptionPane.showInputDialog("ID"));
//						student.setPass(JOptionPane.showInputDialog("PASS"));
//						studentService.upDatePass(student);
//						System.out.println("새로운 비밀번호 : "+studentService.findStudentById(student.getId()).toString());
//						break;
//					case "8":
//						studentService.delDateStudent(JOptionPane.showInputDialog("아이디를 입력하세요"));
////				System.out.println("아이디를 입력하세요");
////				studentService.delDateStudent(scan.next());
//						break;
//					case "9":
//						MainPage mainPage=new MainPage();
//						break;
//			}
//		}
//	}
//}
