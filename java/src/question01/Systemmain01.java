package question01;

public class Systemmain01 {

	public static void main(String[] args) {
		int applePrice = 100;

		applePrice = 200;

		String stationary = "鉛筆、文房具";

		stationary = "消しゴム";

		int bananaPrice = applePrice;

		String writingUtensils = stationary;

		System.out.println("りんごの値段は" + applePrice + "円です。");
		System.out.println("バナナの値段は" + bananaPrice + "円です。");
		System.out.println("この筆記用具は" + writingUtensils + "です。");

	}

}
