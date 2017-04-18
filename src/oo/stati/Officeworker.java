package oo.stati;

public class Officeworker {
      int salary;
      int overtime;
      int late;
      int total;
      static int basic = 22000;
      public Officeworker(int salary,int overtime,int late,int total){
    	  this.salary = salary;
    	  this.overtime = overtime;
    	  this.late = late;
    	  this.total = total;
      }
      private String getScore(int score){
    	  if(score<basic){
    		  return String.valueOf(score+"*");
    	  }else{
    		  return String.valueOf(score);
    	  }
      }
      public void print(){
    	  System.out.println(getScore(salary)+"\t"+getScore(overtime)+"\t"+getScore(late)+"\t"+getScore(total));
      }
}
