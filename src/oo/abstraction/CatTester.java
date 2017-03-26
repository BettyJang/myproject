package oo.abstraction;

public class CatTester {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Carol","Mix","Female",2,"Taiwan");
		Cat cat2 = new Cat("Aaron","American Shorthair","Male",5,"American");
		Cat cat3 = new Cat("Sally","British Longhair","Female",3,"Britian");
		Cat cat4 = new Cat("Frank","Mix","Male",10,"Taiwan");
		Cat cat5 = new Cat("Dorothy","Mix","Female",12,"Taiwan");
		Cat cat6 = new Cat("King","Maine Cat","Male",1,"American");

		Cat [] cats = new Cat[6];
		cats[0] = new Cat("Carol","Mix","Female",2,"Taiwan");
		cats[1] = new Cat("Aaron","American Shorthair","Male",5,"American");
		cats[2] = new Cat("Sally","British Longhair","Female",3,"Britian");
		cats[3] = new Cat("Frank","Mix","Male",10,"Taiwan");
		cats[4] = new Cat("Dorothy","Mix","Female",12,"Taiwan");
		cats[5] = new Cat("King","Maine Cat","Male",1,"American");
		cats[0].id = 156;
		cats[1].id = 489;
		cats[2].id = 756;
		cats[3].id = 594;
		cats[4].id = 315;
		cats[5].id = 173;
		System.out.println(cats[5].name +" "+ cats[5].varity +" " + cats[5].gender + " " + cats[5].ages);
		
	}
}
