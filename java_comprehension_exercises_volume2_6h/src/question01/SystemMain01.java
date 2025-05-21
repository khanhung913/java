package question01;

public class SystemMain01 {
	public static void main(String[] args) {

		//(2)
		Member01 memberA = new Member01();
		memberA.name = "田中";
		memberA.age = 20;
		memberA.authority = 1;
		memberA.coupon = new int[2];

		System.out.println("会員の紹介をします。");
		System.out.println("名前は" + memberA.name + "です。");
		System.out.println("年齢は" + memberA.age + "歳です。");
		if (memberA.authority == 1) {
			System.out.println("権限は一般会員です。");
		} else {
			System.out.println("権限は一般会員以外です。");
		}
		System.out.println("クーポンの数は" + memberA.coupon.length + "個です。");

		//(4)
		Member01 memberB = new Member01();
		Administrator01 adminA = new Administrator01();
		adminA.password = 123;
		adminA.member01 = memberB;
		adminA.member01.name = "加藤";
		adminA.member01.age = 30;
		adminA.member01.authority = 2;
		adminA.member01.coupon = new int[5];
		System.out.println("会員の紹介をします。");
		System.out.println("名前は" + adminA.member01.name + "です。");
		System.out.println("年齢は" + adminA.member01.age + "歳です。");
		if (adminA.member01.authority == 1) {
			System.out.println("権限は一般会員です。");
		} else if (adminA.member01.authority == 2) {
			System.out.println("権限は管理者です。");
		} else {
			System.out.println("権限は登録されていません。");
		}
		System.out.println("クーポンの数は" + adminA.member01.coupon.length + "個です。");

	}
}
