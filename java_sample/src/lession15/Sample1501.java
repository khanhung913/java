package lession15;

public class Sample1501 {

	public static void main(String[] args) {
		Phone1501 phone = new Phone1501();

		phone.setFee(5000);
		phone.setData(2.0);

		System.out.println("誤ったデータ通信量を設定します。");
		phone.setFee(-10000);
		phone.setData(9999.99);
	}

}
