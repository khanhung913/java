package question02;

public class Administrator02 {

	int password;
	Member02 member02;

	void changePass(int pass) {
		System.out.println("パスワードを変更します。");
		password = pass;
		System.out.println("パスワードは" + password + "です。");
	}

	void changeStatus(String changeName, int changeAge) {
		System.out.println("会員情報を入力します");
		this.member02.name = changeName;
		this.member02.age = changeAge;
	}

	void show() {
		System.out.println("名前は" + this.member02.name + "です。");
		System.out.println("年齢は" + this.member02.age + "です。");
	}

	void showCoupon(Member02 member02) {
		System.out.println(this.member02.name + "さんのクーポンの数だけ表示します。");
		System.out.println("クーポンの数は" + member02.coupon.length + "個です。");
	}

}
