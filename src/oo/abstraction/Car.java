package oo.abstraction;

public class Car {
	  int id;
      String brand;
      String name;
      int cc;
      //String type;
      int status;
      float milage;
      
      public Car(String brand,String name,int cc){
    	  this.brand = brand;
    	  this.name = name;
    	  this.cc = cc;
    	  //this.type = type;
      }
      
      public void setMilage(int m){
		milage = m;
      }
      public float addMilage(int m){
    	  milage = milage + m;
    	 return milage;
      }
      
      //如果milage為負的話 不要加入 程式如何設計?
      public void maintain(){
    	  status = 5;
      }
}
