package question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain02 {

	public static void main(String[] args) throws IOException {
		Member02 memberA = new Member02();

		memberA.name = "田中";
		memberA.age = 20;
		memberA.authority = 1;
		memberA.coupon = new int[1];

		memberA.introduction();
		memberA.show();

		Member02 memberB = new Member02();
		Administrator02 adminA = new Administrator02();

		adminA.password = 123;
		adminA.member02 = memberB;

		adminA.member02.name = "加藤";
		adminA.member02.age = 30;
		adminA.member02.authority = 2;
		adminA.member02.coupon = new int[4];

		adminA.changePass(456);

		System.out.println("会員情報を入力します。");
		System.out.println("名前を入力してください。");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();

		System.out.println("年齢を入力してください。");
		String name1 = reader.readLine();
		int age = Integer.parseInt(name1);

		adminA.changeStatus(name, age);
		adminA.show();

		adminA.showCoupon(memberA);
		adminA.showCoupon(memberB);

	}
}