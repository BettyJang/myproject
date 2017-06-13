package oo.test;

public class MemberTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Member member = new Member(null);//因為父類別中建構子加入參數 所以要在此括號中加入String的職
       member.setAge(-5);
       System.out.println(member.getAge());
       //PhoneMember
       PhoneMember member2 = new PhoneMember();
       PhoneMember member3 = new PhoneMember("Hank");
	}
	

}
