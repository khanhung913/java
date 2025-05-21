package question02;

public class Administrator02 {
	int password;
	Member02 member02;

	public void changPass(int pass) {
		System.out.println("パスワードを変更します。");
		this.password = pass;
		System.out.println("パスワードは" + this.password + "です。");
	}

	public void changeStatus(String changeName, int changeAge) {
		System.out.println("会員情報を変更します。");
		this.member02.name = changeName;
		this.member02.age = changeAge;
	}

	public void show() {
		System.out.println("名前は" + this.member02.name + "です。");
		System.out.println("年齢は" + this.member02.age + "歳です。");
	}

	public void showCoupon(Member02 member02) {
		System.out.println(member02.name + "さんのクーポンの数だけ表示します。");
		System.out.println("クーポンの数は" + member02.coupon.length + "個です。");
	}
}
