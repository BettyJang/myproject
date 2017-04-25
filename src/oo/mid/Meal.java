package oo.mid;

public class Meal {
        String name;
        int price;
        String snack;
        public Meal(String name,int price,String snack){
        	this.name= name;
        	this.price = price;
        	this.snack = snack;
        }
        public void print(){
        	System.out.println("請輸入點餐號碼:");
        }
        
}
