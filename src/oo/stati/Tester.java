package oo.stati;

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
		gstu.print();
	}

}
