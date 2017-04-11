package oo.stati;

public class Student {
     int english;
     int math;
     int chinese;
     static int pass = 60;
	public Student(int english, int math, int chinese) {
		super();
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	//快速自動產生:右鍵>Source>Generate Constructor using Fields
	}
     /*public Student(int english,int math,int chinese){
    	 this.english = english;
    	 this.math = math;
    	 this.chinese = chinese;
     }*/
	public void print(){
		System.out.println(getScore(english)+"\t"+
				getScore(math)+"\t"+getScore(chinese));
	}
	private String getScore(int score){
		if(score<pass){
			return String.valueOf(score+"*");
			       //將int score轉變成String的型態
			       //類別方法
		}else{
			return String.valueOf(score);
		}
	}
}