package oo.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		String s = "331";
		//----------0123456789
		String n = "1234567331";
		System.out.println(n.length());//總共幾個數字
		String sub = n.substring(0, 5);
		String sub2 = n.substring(3);
		String sub3 = n.substring(n.length()-3);
		System.out.println(sub);
		System.out.println(sub2);
		System.out.println(sub3);
		ArrayList<String> a = new ArrayList<>();
		a.add("331");
		a.add("821");
		a.add("886");
		a.add("554");
		Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        System.out.println("請輸入發票號碼末三碼:");
        
	}

}
