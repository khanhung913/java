package question02;

public class Member02 {
	String name;
	int age;
	int authority;
	int[] coupon;

	public void show() {
		introduction();
		System.out.println("名前は" + this.name + "です。");
		System.out.println("年齢は" + this.age + "歳です。");
	}

	public void introduction() {
		System.out.println("会員の簡単な紹介をします。");
	}

	public int confirmation() {
		return this.authority;
	}

	//(8)
	public int[] changeCoupon(int number) {
		System.out.println("クーポンの数を変更します。");
		this.coupon = new int[number];
		return this.coupon;
	}
}
