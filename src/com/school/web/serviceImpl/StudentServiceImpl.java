package com.school.web.serviceImpl;

import com.school.web.bean.StudentBean;
import com.school.web.service.StudentService;

public class StudentServiceImpl implements StudentService {
	// 내가 한것
	private int count;// 현재 가입된 인원
	StudentBean[] students;

	public StudentServiceImpl() {
		this.count = 0;
		students = new StudentBean[3];
	}

	@Override
	public void addStudent(StudentBean studentBean) {
		if(students.length==count) {
			StudentBean[] studentBeans=new StudentBean[count+3];
			System.arraycopy(students, 0, studentBeans, 0, count);//객체 새로이 생성
			students=studentBeans;  //students=new stduentbeans(){}.....와 같은 뜻 포인터 끊기.
//			StudentBean[] studentBeans=new StudentBean[count];
//			studentBeans=students;
//			students=new StudentBean[count+3];
//			System.arraycopy(studentBeans, 0, students, 0, count);
		}
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
			for (int i = 0, j = 0; i < count; i++) {
				if (name.equals(students[i].getName())) {
					
					student[j] = students[i];
					j++;
					if (j == size) {
						break;
					}
				}
			}
		}
		return student;
	}

	@Override
	public void upDatePass(StudentBean student) {
		findStudentById(student.getId()).setPass(student.getPass());
	}

	@Override
	public void delDateStudent(String id) {
		for(int i=0;i<students.length;i++) {
			if(id.equals(students[i].getId())) {
				//새로운 students(studentBeans) 에 차례대로 담고
				for(int j=i;j<count-1;j++) {
					if(students[j]!=null) {
						students[j]=students[j+1];
					}
				}
				//배열 카피
				students[count-1]=null;
				count--;
				break;
			}
		}
	}
}
