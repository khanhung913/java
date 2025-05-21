package question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//(2)
		String phoneNumber;
		int fee;
		double internetSpeed;
		SmartPhone phoneA = new SmartPhone();
		System.out.println("電話番号を入力してください。");
		phoneNumber = br.readLine();
		System.out.println("料金を入力してください。");
		String tempFee = br.readLine();
		fee = Integer.parseInt(tempFee);
		phoneA.setPhoneNumber(phoneNumber);
		phoneA.setFee(fee);

		//(3)
		System.out.println("通信速度を入力してください。");
		String tempSpeed = br.readLine();
		internetSpeed = Double.parseDouble(tempSpeed);
		phoneA.setInternetSpeed(internetSpeed);

		//(5)
		Telephone phoneB = new Telephone();
		phoneB.setPhoneNumber("0123456789");
		phoneB.setFee(9);
		phoneA.showInfo();
		phoneB.showInfo();

		//(6)
		if (phoneA.equals(phoneB))
			System.out.println("同じオブジェクトを参照しています。");
		else
			System.out.println("違うオブジェクトです。");

	}

}
