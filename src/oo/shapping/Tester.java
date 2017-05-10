package oo.shapping;

public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c = new Customer();
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
		g2.print();
		
}
}