package oo.io;

import java.util.Scanner;

public class SimpleWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
     Scanner scanner =  new Scanner(System.in);
     for(int i=0;i<12;i++){
		System.out.println("請輸入每個月的薪水:");
		String data = scanner.nextLine();
		try{
			int score = Integer.parseInt(data);
		sum = sum + score;
		}catch (NumberFormatException e) {
			System.out.println("輸入格式錯誤,請重新輸入:");
			i--;
		}
     }
     System.out.println("今年年薪為:"+sum);
     if(sum<30000){
    	 System.out.println("今年無須繳稅");
     }else{
    	 System.out.println("今年需繳稅,請至財政部網站或稅捐處試算需繳額度.");
     }
	}
}
