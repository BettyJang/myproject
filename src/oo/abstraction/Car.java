package oo.abstraction;

public class Car {
	  int id;
      String brand;
      String name;
      int cc;
      //String type;
      int status;
      float milage;
      
      public Car(String brand,String name){
    	  this(brand,name,0);//一定要在第一行
    	 System.out.println("haha");
      }
      
     public Car(String brand,String name,int cc){
    	  this.brand = brand;
    	  this.name = name;
    	  this.cc = cc;
    	  this.setMilage(0);
      }
      //如果公里數為負的話 不要加入 程式如何設計?
      public void setMilage(int m){
		milage = m;
      }
      public float addMilage(int m){
    	milage = milage + m;
    	if(m<0){
    		System.out.println("公里數不得為負,請重新輸入");
    		milage = milage - m;
    		return milage;
    	}else{
    	    return milage;
    	}
    	
      }
}

     