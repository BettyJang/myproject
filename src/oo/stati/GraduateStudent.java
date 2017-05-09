package oo.stati;

public class GraduateStudent extends Student{
	int thesis;
	public GraduateStudent(int english, int math, int chinese){
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	//@Override //怕複寫寫錯而加入的檢查機制
	/*public void print(){
		System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+
	getScore(chinese)+"\t"+thesis);
	}*/
}

