package question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Member02 memberA = new Member02();
		memberA.name = "田中";
		memberA.age = 20;
		memberA.authority = 1;
		memberA.coupon = new int[2];
		memberA.show();

		//(4)
		Member02 memberB = new Member02();
		Administrator02 adminA = new Administrator02();
		adminA.password = 123;
		adminA.member02 = memberB;
		adminA.member02.name = "加藤";
		adminA.member02.age = 30;
		adminA.member02.authority = 2;
		adminA.member02.coupon = new int[5];
		adminA.changPass(456);

		//(5)
		System.out.println("会員情報を変更します。");
		System.out.println("名前を入力してください。");
		String name = br.readLine();
		System.out.println("年齢を入力してください。");
		String tempAge = br.readLine();
		int age = Integer.parseInt(tempAge);
		adminA.changeStatus(name, age);
		adminA.show();

		//問題(6)
		adminA.showCoupon(memberA);
		adminA.showCoupon(memberB);

		//問題(7)
		System.out.println(memberA.name + "さんの権限を確認します。");
		int authority = memberA.confirmation();
		if (authority == 1)
			System.out.println("権限は一般会員です。");
		else if (authority == 2)
			System.err.println("権限は管理者です。");
		else
			System.out.println("権限は登録されていません。");

		//問題(8)
		int[] newCoupon = memberA.changeCoupon(7);
		System.out.println("クーポンの数は" + newCoupon.length + "個です。");
	}

}
