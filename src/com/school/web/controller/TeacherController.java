package com.school.web.controller;

import java.util.Scanner;

import com.school.web.bean.StudentBean;
import com.school.web.bean.TeacherBean;
import com.school.web.service.TeacherService;

public class TeacherController{
	public void main(String[] str) {
		Scanner scan = new Scanner(System.in);
		TeacherBean teacherBean = new TeacherBean();
		teacherBean.setId(scan.next());
		teacherBean.setName(scan.next());
		teacherBean.setPass(scan.next());
		teacherBean.setSubject(scan.next());
	}
}
