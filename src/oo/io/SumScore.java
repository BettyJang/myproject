package oo.io;

import java.io.FileOutputStream;
import java.util.Scanner;

public class SumScore {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 5; i++){
			System.out.print("請輸入成績:");
			String data = scanner.nextLine();
			try{ //try catch專門處理Exception的問題
				int score = Integer.parseInt(data);
				sum = sum + score;
			}catch(NumberFormatException e){
				System.out.print("成績格式不符合規定");
				i--;
			}
		}
	System.out.print("總成績為:"+sum);
		//FileOutputStream fos = new FileOutputStream("data.txt");
}
}
