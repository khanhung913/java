package lession13;

public class Sample1301 {

	public static void main(String[] args) {
		Phone1301 phone=new Phone1301();
		
		phone.fee=5000;
		phone.data=2.0;

		System.out.println("料金は"+phone.fee+"円です。");
		System.out.println("データ通信量は"+phone.data+"GBです。");
	}

}
