package oo.shapping;

public class GoldenCustomer extends SilverCustomer{
       //float returnrate =(int)(amount*0.9)	
      /* String level = "金級會員";
       public void GoldenCustomer(int m){
    	   amount = m;
    	   discount = m*0.9f;
    	   returnrate = m*0.05f;
       }
       public void print(){
    	  System.out.println(level+":"+" "+"消費金額:"+amount+" "+"折扣後金額:"+discount+" "+"還元金:"+returnrate+"\n");
       }*/
       float returnrate = 0.05f;
       public GoldenCustomer(){
    	   super();
       }
       public GoldenCustomer(int amount){
    	   super(amount);
       }
       public void print(){
    	   System.out.println(amount+"\t"+(amount*discount)+"\t"+(amount*returnrate));
       }
}
