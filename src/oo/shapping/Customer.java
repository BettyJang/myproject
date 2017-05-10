package oo.shapping;

public class Customer {
    Customer(){
    }
  int amount;
  float discount = 0;
  float returnrate = 0;
  String level = "一般會員";
  public void Customer(int m){
	  amount = m;
  }
  public void print(){
	  System.out.println(level+":"+" "+"消費金額:"+amount+" "+"折扣後金額:"+discount+" "+"還原金:"+returnrate+"\n");
  }
}
