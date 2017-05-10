package oo.shapping;

public class SilverCustomer extends Customer{
    //float discount = (int)(amount*0.9);
    String level = "銀級會員";
    public void SilverCustomer(int m){
    	amount = m;
    	discount = m*0.9f;
    }
    public void print(){
    	System.out.println(level+":"+" "+"消費金額:"+amount+" "+"折扣後金額:"+discount+" "+"還元金:"+returnrate+"\n");
    }
}
