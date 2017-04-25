package oo.mid;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> a = new ArrayList<>();
        a.add("Beauty and the Beast");
        a.add("Baby Boss");
        a.add("目擊者");
        a.add("玩命關頭8");
        a.add("逃出絕命鎮");
        String a1 = a.get(0);
        String a2 = a.get(1);
        String a3 = a.get(2);
        String a4 = a.get(3);
        String a5 = a.get(4);
        Ticket t1 = new Ticket(22546,"Beauty and the Beast", 240);
        Ticket t2 = new Ticket(11546, "Baby Boss", 245);
        Ticket t3 = new Ticket(66498, "目擊者", 230);
        Ticket t4 = new Ticket(99785, "玩命關頭8", 220);
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入電影名稱或電影代碼:");
        String user = scanner.nextLine();
        
	}

}
