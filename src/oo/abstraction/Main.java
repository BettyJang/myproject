package oo.abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car c = new Car("XXX","name",1200);
        c.setMilage(20000);
        float current = c.addMilage(50);
        System.out.print("目前里程為:"+current);
        //System.out.print(c.milage);
	}

}
