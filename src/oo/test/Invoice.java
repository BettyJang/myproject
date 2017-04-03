package oo.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		//String s = "331";
		//----------0123456789
		/*String n = "1234567331";
		System.out.println(n.length());//總共幾個數字
		String sub = n.substring(0, 6);
		String sub2 = n.substring(3);
		String sub3 = n.substring(n.length()-3);
		System.out.println(sub);
		System.out.println(sub2);
		System.out.println(sub3);*/
		//發票對獎---------------------
		ArrayList<String> a = new ArrayList<>();
		a.add("331");
		a.add("821");
		a.add("886");
		a.add("554");
		String a1 = a.get(0);
		String a2 = a.get(1);
		String a3 = a.get(2);
		String a4 = a.get(3);
		Scanner scanner = new Scanner(System.in);
	    System.out.println("請輸入發票號碼:");
        String user = scanner.nextLine();
        String sub4 = user.substring(user.length()-3);
        System.out.println(sub4);
        System.out.println(a);
        if((sub4.equals(a1))||(sub4.equals(a2))||(sub4.equals(a3))||(sub4.equals(a4))){
        	System.out.println("恭喜您中獎了:D");
        }else{
        	System.out.println("真可惜,您摃龜了:(");
        }
	
}
}