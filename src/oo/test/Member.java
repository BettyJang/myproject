package oo.test;

public class Member {
     String id;
    private int age;
     String name;
     public Member(String name){//父類別的建構子中加入參數 而子類別卻沒有在建構子
    	                        //中加入super()的話 便無法執行
    	 System.out.println("member construction");
    	 this.name = name;
     }
     public Member(){
    	 
     }
     public void setAge(int age){
    	 if(age<0){
    		 age = 0;
    	 }
    	 this.age = age;
     }
     public int getAge(){
    	 return age;
     }
}
