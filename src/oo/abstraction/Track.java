package oo.abstraction;

public class Track extends Car {
 int id;
 public Track(String brand,String name,int cc,int id){
	 this.brand = brand;
	 this.name = name;
	 this.cc = cc;
	 this.id = id;
 }
 @Override
 public void print(){
	 System.out.println(brand+"　"+name+"　"+getScore(cc)+" "+id);
 }
}
