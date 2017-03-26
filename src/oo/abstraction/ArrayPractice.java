package oo.abstraction;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] n = new int[]{1,5,5,7,22,79,45,64,89,10};
       for(int i=0;i<=9;i++){
    	   for(int j=i+1;j<=9;j++){
    		   if(n[i]>n[j]){
    			   int tmp = n[i];
    			   n[i] = n[j];
    			   n[j] = tmp;
    		   }
    	   }
    	   System.out.println(n[i]+" ");
       }
       int [] m = new int[5];
       System.out.println(m[3]);
       
	Cat[] cats = new Cat[3];
	cats[0] = new Cat("Carol","Mix","Female",2,"Taiwan");
	cats[1] = new Cat("Aaron","American Shorthair","Male",5,"American");
	cats[2] = new Cat("Sally","British Longhair","Female",3,"Britian");
	int b = 0;
	for(b=0;b<3;b++){
		System.out.println(cats[b].birthplace);
	}
		int c=1;
		for(c=b+1;c<20;c=c+2){
			System.out.println(c);
		}
		int d = 5;
		for(d=5;d<20;d=d+3){
			System.out.println(d);
		}
		class Cat{
			
		}
		Cat q = new Cat();
	}
	
}


