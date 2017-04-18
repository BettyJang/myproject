package oo.stati;

public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Officeworker work1 = new Officeworker(33000, 2000, 0, 35000);
        Officeworker work2 = new Officeworker(40000, 5000, -2000, 43000);
        Officeworker work3 = new Officeworker(18000, 1000, -500, 18500);
        work1.print();
        work2.print();
        work3.print();
	}

}
