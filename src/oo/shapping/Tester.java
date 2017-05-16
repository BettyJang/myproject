package oo.shapping;

import java.util.ArrayList;

public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Customer c = new Customer();
		Customer c2 = new Customer();
		SilverCustomer s = new SilverCustomer();
		SilverCustomer s2 = new SilverCustomer();
		GoldenCustomer g = new GoldenCustomer();
		GoldenCustomer g2 = new GoldenCustomer();
		c.Customer(6000);
		s.SilverCustomer(8000);
		s2.SilverCustomer(10000);
		g.GoldenCustomer(30000);
		c2.Customer(2000);
		g2.GoldenCustomer(10000);
		System.out.println("今日的消費紀錄如下:"+"\n");
		c.print();
		s.print();
		s2.print();
		g.print();
		c2.print();
		g2.print();*/
		System.out.println("原價"+"\t"+"折扣後"+"\t"+"還原金"+"\t");
		ArrayList<Customer> list = new ArrayList();
		list.add(new Customer(6000));
		list.add(new SilverCustomer(8000));
		list.add(new SilverCustomer(10000));
		list.add(new GoldenCustomer(30000));
		list.add(new Customer(2000));
		list.add(new GoldenCustomer(10000));
		/*for(int i = 0 ;i < list.size(); i ++ ){
			Customer cus = list.get(i);*/
		for(Customer cus : list){//foreach迴圈
			if(cus instanceof SilverCustomer && !(cus instanceof GoldenCustomer)){
				System.out.println("*");
				SilverCustomer silver = (SilverCustomer)cus;//轉型
			}
			cus.print();
		}
		
}
}