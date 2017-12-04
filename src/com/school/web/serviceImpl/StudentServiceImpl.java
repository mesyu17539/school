package com.school.web.serviceImpl;

import com.school.web.bean.StudentBean;
import com.school.web.service.StudentService;

public class StudentServiceImpl implements StudentService {
	// 내가 한것
	private int count;// 현재 가입된 인원
	StudentBean[] students;

	public StudentServiceImpl(int count) {
		this.count = 0;
		students = new StudentBean[count];
	}

	@Override
	public void addStudent(StudentBean studentBean) {
		students[this.count] = studentBean;
		this.count++;
	}

	@Override
	public StudentBean[] list() {
		return students;
	}

	@Override
	public int getCount() {
		return this.count;
	}

	@Override
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void addScore(StudentBean score) {
	}

	@Override
	public StudentBean login(StudentBean studentBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentBean findStudentById(String id) {
		StudentBean student = new StudentBean();
		for (int i = 0; i < count; i++) {
			if (id.equals(students[i].getId())) {
				student = students[i];
			}
		}
		return student;
	}

	@Override
	public StudentBean[] findStudentByName(String name) {
		StudentBean[] student = null;
		int size = 0;
		for (int i = 0; i < count; i++) {
			if (name.equals(students[i].getName())) {
				size++;
			}
		}
		student = new StudentBean[size];
		if (size != 0) {
			for (int i = 0,j = 0; i < count; i++) {
				if (name.equals(students[i].getName())) {
					student[j] = students[i];
					j++;
					if(j==size) {
						break;
					}
				}
			}
		}
		return student;
	}
}
// private int num, start;//현재 가입된 인원
// StudentBean[] students;
//
// public StudentServiceImpl() {
// this.start=0;
// students= null;
// }
//
// @Override
// public void addStudent(StudentBean studentBean) {
// students[start]=studentBean;
// start++;
// }
//
// @Override
// public int getNum() {
// return this.num;
// }
//
// @Override
// public void setNum(int num) {
// this.num = num;
// students= new StudentBean[this.num];
// System.out.println("setNum 내부 count "+this.num);
// }
//
//
// public void addScore(StudentBean score) {
// }
//
// @Override
// public StudentBean login(StudentBean studentBean) {
// // TODO Auto-generated method stub
// return null;
// }
//
// @Override
// public StudentBean find(String id) {
// // TODO Auto-generated method stub
// return null;
// }
//
