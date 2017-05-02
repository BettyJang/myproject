package oo.stati;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		//獨立方法
		System.out.println(Student.pass);
		Student stu1 = new Student(55, 78, 90);
		stu1.english = -99;
		Student stu2 = new Student(98, 65, 89);
		stu1.pass = 60;
		stu1.print();
		stu2.print();
		GraduateStudent gstu = new GraduateStudent(66,70, 98);
		GraduateStudent gstu2 = new GraduateStudent(88, 66, 44);
		gstu.print();
		gstu2.print();
		//
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(58, 68, 87));
		list.add(new Student(68, 75, 37));
		list.add(new Student(33, 64, 98));
		list.add(new GraduateStudent(90, 67, 50));
		list.add(new GraduateStudent(94, 56, 79));
		for(int i = 0; i<list.size();i++){
			Student stu = list.get(i);
			stu.print();
		}
	}

}
