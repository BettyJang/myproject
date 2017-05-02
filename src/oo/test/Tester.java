package oo.test;

import java.util.ArrayList;

import oo.abstraction.Car;
//import oo.stati.Student;


public class Tester {

	public static void main(String[] args) {
	     Car car = new Car("ZZZ","AAA",1200); 
         ArrayList<String> a = new ArrayList();
         //String[] numbers = {"220","156","478","123"};
         a.add("220");
         a.add("156");
         a.add("123");
         //a.add(444);
         System.out.println(a.size());
         a.add("489");
        //a.add(true);
         System.out.println(a.size());
         a.set(2, "789");
         System.out.println(a);
         String data =(String)a.get(2);
         String n = a.get(3);
         System.out.println(data);
         System.out.println(n);  
         //int n = (int)a.get(0);
         //Student stu = new Student();
	}

}
